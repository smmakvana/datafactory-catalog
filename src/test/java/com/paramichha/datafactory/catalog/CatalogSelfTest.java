/*
 * Copyright 2026 Sanjay Makvana
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paramichha.datafactory.catalog;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Checks the catalog itself, so a fixture that is added, renamed or left undocumented fails the
 * build instead of silently weakening DataFactory and TestKit tests.
 */
@DisplayName("Catalog self-check")
class CatalogSelfTest {

    private static final Path SOURCES = Path.of("src/main/java/com/paramichha/datafactory/catalog");
    private static final String BASE = "com.paramichha.datafactory.catalog";
    private static final Set<String> STYLES = Set.of("Record", "Lombok", "AllArgs", "Pojo");

    private static List<Path> fixtures() throws IOException {
        try (Stream<Path> files = Files.walk(SOURCES)) {
            return files.filter(p -> p.toString().endsWith(".java"))
                    .filter(p -> !p.getFileName().toString().equals("package-info.java"))
                    .sorted()
                    .collect(Collectors.toList());
        }
    }

    private static String read(Path p) {
        try {
            return Files.readString(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Test
    @DisplayName("every package has a package-info description")
    void everyPackageIsDescribed() throws IOException {
        List<Path> missing = fixtures().stream()
                .map(Path::getParent)
                .distinct()
                .filter(dir -> !Files.exists(dir.resolve("package-info.java")))
                .collect(Collectors.toList());
        assertThat(missing).as("packages without package-info.java").isEmpty();
    }

    @Test
    @DisplayName("every fixture class has Javadoc")
    void everyClassIsDocumented() throws IOException {
        List<String> undocumented = fixtures().stream()
                .filter(p -> !read(p).contains("/**"))
                .map(Path::toString)
                .collect(Collectors.toList());
        assertThat(undocumented).as("classes without Javadoc").isEmpty();
    }

    @Test
    @DisplayName("no wildcard imports")
    void noWildcardImports() throws IOException {
        List<String> offenders = fixtures().stream()
                .filter(p -> read(p).matches("(?s).*import [\\w.]+\\.\\*;.*"))
                .map(Path::toString)
                .collect(Collectors.toList());
        assertThat(offenders).as("files with wildcard imports").isEmpty();
    }

    @Test
    @DisplayName("every annotation package has all four styles")
    void everyConstraintHasAllStyles() throws IOException {
        List<Path> constraintDirs;
        try (Stream<Path> dirs = Files.list(SOURCES.resolve("annotation"))) {
            constraintDirs = dirs.filter(Files::isDirectory).sorted().collect(Collectors.toList());
        }
        for (Path dir : constraintDirs) {
            Set<String> styles;
            try (Stream<Path> files = Files.list(dir)) {
                styles = files.map(p -> p.getFileName().toString().replace(".java", ""))
                        .filter(n -> !n.equals("package-info"))
                        .map(n ->
                                STYLES.stream().filter(n::endsWith).findFirst().orElse("?"))
                        .collect(Collectors.toSet());
            }
            assertThat(styles).as("styles in " + dir.getFileName()).containsAll(STYLES);
        }
    }

    @Test
    @DisplayName("every fixture class compiles and loads")
    void everyFixtureLoads() throws IOException {
        List<String> failed = fixtures().stream()
                .map(p -> {
                    String relative =
                            SOURCES.relativize(p).toString().replace('\\', '/').replace(".java", "");
                    return BASE + "." + relative.replace('/', '.');
                })
                .filter(name -> {
                    try {
                        Class.forName(name);
                        return false;
                    } catch (ClassNotFoundException | LinkageError e) {
                        return true;
                    }
                })
                .collect(Collectors.toList());
        assertThat(failed).as("classes that do not load").isEmpty();
    }
}

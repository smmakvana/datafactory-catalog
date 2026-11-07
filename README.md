# datafactory-catalog

[![Java 21+](https://img.shields.io/badge/Java-21%2B-blue)](https://openjdk.org/)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache%202.0-green)](LICENSE)

A catalog of Jakarta-annotated test fixtures. Each shape is written in four styles, so the Paramichha
generators are tested against every way people write a class.

- **[DataFactory](https://github.com/smmakvana/paramichha-datafactory)** and
  **[TestKit](https://github.com/smmakvana/paramichha-testkit)** use these fixtures as their test data.
- **[docs/COVERAGE.md](docs/COVERAGE.md)** lists every package: its description, its class count, and which styles it covers.

## The Paramichha libraries

| Library | What it does | Maven coordinates |
|---|---|---|
| [paramichha-dev](https://github.com/smmakvana/paramichha-dev) | Parent POM: Java 21, shared versions, release setup | `com.paramichha:paramichha-dev` |
| [paramichha-utils](https://github.com/smmakvana/paramichha-utils) | Dependency-free helpers: seeds, naming, token templates, guards | `com.paramichha:paramichha-utils` |
| [datafactory-catalog](https://github.com/smmakvana/datafactory-catalog) | Test fixtures: annotated classes in four styles | `com.paramichha:datafactory-catalog` (test scope) |
| [DataFactory](https://github.com/smmakvana/paramichha-datafactory) | Generates valid and invalid test data from Jakarta validation annotations | `com.paramichha:datafactory` (test scope) |
| [TestKit](https://github.com/smmakvana/paramichha-testkit) | Generates JUnit 5 tests for a class, using DataFactory for the data | `com.paramichha:testkit` |
| [TestBuddy](https://github.com/smmakvana/paramichha-testbuddy) | IntelliJ IDEA plugin that runs TestKit from the IDE (Free and Pro) | JetBrains Marketplace |

## Install

Test scope only. This is fixture data, not a library to ship:

```xml
<dependency>
    <groupId>com.paramichha</groupId>
    <artifactId>datafactory-catalog</artifactId>
    <version>0.2.0</version>
    <scope>test</scope>
</dependency>
```

Requires Java 21 or later.

## The four styles

Every shape exists in each style, so an instantiation strategy cannot hide a bug:

| Style | Suffix | Shape |
|---|---|---|
| Record | `Record` | `public record`, with constraints on the components |
| Lombok | `Lombok` | `@Value @Builder` class |
| All-args | `AllArgs` | `@Value @AllArgsConstructor` class |
| JavaBean | `Pojo` | Class with a no-argument constructor, getters and setters |

## Layout

Fixtures are grouped by what they test:

- `annotation/<constraint>`: one Jakarta constraint per package, such as `notnull`, `size` or `email`.
- `annotation/combined`: several constraints on the same fields.
- `collection/<kind>`: `list`, `set`, `map`, `queue` and `array`.
- Type packages such as `number`, `decimal`, `text`, `date`, `datetime`, `timepart`, `logical`, `identifier`, `enumtype` and `optional`.
- `nested`: nested objects validated through `@Valid`.
- `realworld/<domain>`: domain-shaped classes, such as payments, registrations and trades.
- `unsupported`: shapes that generators are expected to reject or degrade on.

Every package has a `package-info.java` describing it. Every class has Javadoc naming its constraints.

## Verify the catalog

```bash
mvn test
```

`CatalogSelfTest` fails the build if a package has no description, a class has no Javadoc, a wildcard import
is used, an annotation package is missing one of the four styles, or a class does not load.

## Add a fixture

1. Pick the package that matches what the fixture tests. Create the class in each of the four styles.
2. Add a Javadoc comment to each class, naming the constraints it uses.
3. Run `mvn test`. The self-check must pass.
4. Regenerate `docs/COVERAGE.md` if you added a package or changed a description.
5. Changing a fixture changes the expected output of DataFactory and TestKit. Re-record their snapshots in the same change.

## Limitations

- **Fixtures, not a domain model.** The classes are deliberately simple. They do not model real business rules.
- **Changing a fixture changes downstream tests.** DataFactory's snapshot tests and TestKit's tests pin the generated output
  for these classes. Re-record them when a fixture changes.
- **Built with Lombok.** Lombok is needed only to compile this module. Users of the jar do not need it.

## License

Apache License 2.0. See [LICENSE](LICENSE).

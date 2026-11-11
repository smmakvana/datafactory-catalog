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
package com.paramichha.datafactory.catalog.collection.array;

import jakarta.validation.constraints.NotNull;

/**
 * Array fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotNull.
 */
// A fixture for plain array properties: it stores and returns the arrays as given, on purpose.
@SuppressWarnings({"PMD.ArrayIsStoredDirectly", "PMD.MethodReturnsInternalArray", "PMD.UseVarargs"})
public class ArrayPojo {
    @NotNull String[] names;

    @NotNull int[] scores;

    String[] tags;

    public ArrayPojo() {}

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}

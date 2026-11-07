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
package com.paramichha.datafactory.catalog.collection.set;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

/**
 * Set fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotEmpty, @Size.
 */
public class SetPojo {
  @NotEmpty Set<String> roles;

  @Size(min = 1, max = 5)
  Set<String> tags;

  Set<Integer> scores;

  public SetPojo() {}

  public Set<String> getRoles() {
    return roles;
  }

  public void setRoles(Set<String> roles) {
    this.roles = roles;
  }

  public Set<String> getTags() {
    return tags;
  }

  public void setTags(Set<String> tags) {
    this.tags = tags;
  }

  public Set<Integer> getScores() {
    return scores;
  }

  public void setScores(Set<Integer> scores) {
    this.scores = scores;
  }
}

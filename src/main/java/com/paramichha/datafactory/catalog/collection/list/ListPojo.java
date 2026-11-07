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
package com.paramichha.datafactory.catalog.collection.list;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Collection;
import java.util.List;

/**
 * List fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotEmpty, @Size.
 */
public class ListPojo {
  @NotEmpty List<String> roles;

  @Size(min = 1, max = 5)
  List<String> tags;

  List<Integer> scores;
  Collection<String> labels;

  public ListPojo() {}

  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public List<Integer> getScores() {
    return scores;
  }

  public void setScores(List<Integer> scores) {
    this.scores = scores;
  }

  public Collection<String> getLabels() {
    return labels;
  }

  public void setLabels(Collection<String> labels) {
    this.labels = labels;
  }
  ;
}

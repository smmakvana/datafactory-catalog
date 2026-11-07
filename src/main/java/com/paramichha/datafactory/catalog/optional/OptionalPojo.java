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
package com.paramichha.datafactory.catalog.optional;

import jakarta.validation.constraints.NotBlank;
import java.util.Optional;

/**
 * Optional fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotBlank.
 */
public class OptionalPojo {
  @NotBlank String required;
  Optional<String> nickname;
  Optional<Integer> age;

  public OptionalPojo() {}

  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public Optional<String> getNickname() {
    return nickname;
  }

  public void setNickname(Optional<String> nickname) {
    this.nickname = nickname;
  }

  public Optional<Integer> getAge() {
    return age;
  }

  public void setAge(Optional<Integer> age) {
    this.age = age;
  }
  ;
}

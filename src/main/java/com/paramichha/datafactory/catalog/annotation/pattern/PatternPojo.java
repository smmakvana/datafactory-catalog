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
package com.paramichha.datafactory.catalog.annotation.pattern;

import jakarta.validation.constraints.Pattern;

/**
 * Pattern fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @Pattern.
 */
public class PatternPojo {
  @Pattern(regexp = "[A-Z]{2}\\d{4}")
  String reference;

  @Pattern(regexp = "\\d{2}/\\d{2}")
  String expiryDate;

  public PatternPojo() {}

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }
  ;
}

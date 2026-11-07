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
package com.paramichha.datafactory.catalog.annotation.url;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

/**
 * Url fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotBlank.
 */
public class UrlPojo {
  @NotBlank @URL String website;
  @URL String apiEndpoint;

  public UrlPojo() {}

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getApiEndpoint() {
    return apiEndpoint;
  }

  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }
  ;
}

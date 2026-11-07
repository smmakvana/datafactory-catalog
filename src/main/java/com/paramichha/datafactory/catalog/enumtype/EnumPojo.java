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
package com.paramichha.datafactory.catalog.enumtype;

import jakarta.validation.constraints.NotNull;

/**
 * Enum fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @NotNull.
 */
public class EnumPojo {
  @NotNull OrderStatus status;
  OrderStatus previousStatus;

  public EnumPojo() {}

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public OrderStatus getPreviousStatus() {
    return previousStatus;
  }

  public void setPreviousStatus(OrderStatus previousStatus) {
    this.previousStatus = previousStatus;
  }
  ;
}

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
package com.paramichha.datafactory.catalog.annotation.assertbool;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;

/**
 * AssertBool fixture: JavaBean with getters and setters.
 *
 * <p>Constraints: @AssertFalse, @AssertTrue.
 */
public class AssertBoolPojo {
    @AssertTrue boolean active;

    @AssertFalse boolean deleted;

    public AssertBoolPojo() {}

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    ;
}

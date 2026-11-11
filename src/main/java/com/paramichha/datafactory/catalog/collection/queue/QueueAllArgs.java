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
package com.paramichha.datafactory.catalog.collection.queue;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Deque;
import java.util.Queue;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Queue fixture: Lombok @Value class with an all-arguments constructor.
 *
 * <p>Constraints: @NotEmpty, @Size.
 */
@Value
@AllArgsConstructor
public class QueueAllArgs {
    @NotEmpty Queue<String> tasks;

    @Size(min = 1, max = 10) Deque<String> history;

    Queue<Integer> priorities;
}

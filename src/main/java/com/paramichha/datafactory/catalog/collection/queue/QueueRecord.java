package com.paramichha.datafactory.catalog.collection.queue;
import jakarta.validation.constraints.*;
import java.util.*;

public record QueueRecord(
    @NotEmpty Queue<String> tasks,
    @Size(min=1, max=10) Deque<String> history,
    Queue<Integer> priorities
) {}

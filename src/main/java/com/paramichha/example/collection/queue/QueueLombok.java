package com.paramichha.example.collection.queue;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.Builder;
import lombok.Value;

@Value @Builder
public class QueueLombok {
    @NotEmpty Queue<String> tasks;
    @Size(min=1, max=10) Deque<String> history;
    Queue<Integer> priorities;
}

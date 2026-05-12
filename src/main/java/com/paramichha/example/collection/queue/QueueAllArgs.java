package com.paramichha.example.collection.queue;
import jakarta.validation.constraints.*;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class QueueAllArgs {
    @NotEmpty Queue<String> tasks;
    @Size(min=1, max=10) Deque<String> history;
    Queue<Integer> priorities;
}

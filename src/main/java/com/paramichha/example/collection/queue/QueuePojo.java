package com.paramichha.example.collection.queue;
import jakarta.validation.constraints.*;
import java.util.*;

public class QueuePojo {
    @NotEmpty Queue<String> tasks;
    @Size(min=1, max=10) Deque<String> history;
    Queue<Integer> priorities;
    public QueuePojo() {}
    public Queue<String> getTasks() { return tasks; }
    public void setTasks(Queue<String> tasks) { this.tasks = tasks; }
    public Deque<String> getHistory() { return history; }
    public void setHistory(Deque<String> history) { this.history = history; }
    public Queue<Integer> getPriorities() { return priorities; }
    public void setPriorities(Queue<Integer> priorities) { this.priorities = priorities; }
}

package com.paramichha.datafactory.catalog.collection.map;
import jakarta.validation.constraints.*;
import java.util.*;

public class MapPojo {
    @NotEmpty Map<String, String> headers;
    @Size(min=1, max=10) Map<String, Integer> scores;
    Map<String, Object> metadata;
    public MapPojo() {}
    public Map<String, String> getHeaders() { return headers; }
    public void setHeaders(Map<String, String> headers) { this.headers = headers; }
    public Map<String, Integer> getScores() { return scores; }
    public void setScores(Map<String, Integer> scores) { this.scores = scores; }
    public Map<String, Object> getMetadata() { return metadata; }
    public void setMetadata(Map<String, Object> metadata) { this.metadata = metadata; }
}

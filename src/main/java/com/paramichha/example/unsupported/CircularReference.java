package com.paramichha.example.unsupported;

/**
 * Demonstrates a type DataFactory does not currently support.
 * Reason: Self-referential — DataFactory breaks the cycle by returning null
 */
public class CircularReference {
    public CircularReference child;
}

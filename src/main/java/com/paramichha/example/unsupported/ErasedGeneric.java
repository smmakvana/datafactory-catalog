package com.paramichha.example.unsupported;

/**
 * Demonstrates a type DataFactory does not currently support.
 * Reason: Raw/erased generic — DataFactory cannot infer element type
 */
public class ErasedGeneric {
    public java.util.List items;
}

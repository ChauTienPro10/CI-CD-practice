package org.example.taggingInterface;

interface Logging {
    default void log(String message) {
        System.out.println("Long: " + message);
    }
}

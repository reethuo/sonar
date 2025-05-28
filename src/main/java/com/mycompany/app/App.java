package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        try {
        // Keep the app alive for demonstration purposes
        Thread.sleep(Long.MAX_VALUE);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    }

    public String getMessage() {
        return MESSAGE;
    }
}

//package com.mycompany.app;

/**
 * Hello world!
 */
/*public class App {

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
}*/

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8082), 0);
        server.createContext("/", new HelloHandler());
        server.start();
        System.out.println("Server started on port 8082");
    }

    static class HelloHandler implements HttpHandler {
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello from Java HTTP Server!";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}


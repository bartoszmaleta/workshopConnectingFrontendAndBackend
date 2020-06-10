package org.example;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/students", new StudentHandler());
        server.setExecutor(null);
        server.start();

        System.out.println("Server has started on port 8000");


        System.out.println( "Hello World!" );
    }
}

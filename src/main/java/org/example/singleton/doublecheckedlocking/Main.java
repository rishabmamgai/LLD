package org.example.singleton.doublecheckedlocking;


public class Main {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.doSomething();
    }
}

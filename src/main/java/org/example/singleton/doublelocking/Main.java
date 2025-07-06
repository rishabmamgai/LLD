package org.example.singleton.doublelocking;


public class Main {
    public static void main(String[] args) {
        Connection connection = new Connection();
        connection.doSomething();
    }
}

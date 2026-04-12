package org.example.creational.singleton.doublelocking;


public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        connection.doSomething();
    }
}

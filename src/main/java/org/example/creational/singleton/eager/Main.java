package org.example.creational.singleton.eager;


public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        connection.doSomething();
    }
}

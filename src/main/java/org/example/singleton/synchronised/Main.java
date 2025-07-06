package org.example.singleton.synchronised;


public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        connection.doSomething();
    }
}

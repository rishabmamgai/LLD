package org.example.singleton.lazy;


public class Main {
    public static void main(String[] args) {
        Connection connection = Connection.getInstance();
        connection.doSomething();
    }
}

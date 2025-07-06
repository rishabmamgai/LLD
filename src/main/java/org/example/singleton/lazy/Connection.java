package org.example.singleton.lazy;


public class Connection {
    private static Connection instance;

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }

        return instance;
    }

    public void doSomething() {
        System.out.println("This is singleton lazy instance.");
    }
}

package org.example.creational.singleton.synchronised;


public class Connection {
    private static Connection instance;

    private Connection() {}

    synchronized public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }

        return instance;
    }

    public void doSomething() {
        System.out.println("This is singleton synchronised instance.");
    }
}

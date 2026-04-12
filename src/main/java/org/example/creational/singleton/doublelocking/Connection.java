package org.example.creational.singleton.doublelocking;


public class Connection {
    private static Connection instance;

    private Connection() {}

    public static Connection getInstance() {
        if (instance == null) {
            synchronized (Connection.class) {
                if (instance == null) {
                    instance = new Connection();
                }
            }
        }

        return instance;
    }

    public void doSomething() {
        System.out.println("This is singleton double locking instance.");
    }
}

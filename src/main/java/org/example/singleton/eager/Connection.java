package org.example.singleton.eager;

import lombok.Getter;


public class Connection {
    @Getter
    private static final Connection instance = new Connection();

    public void doSomething() {
        System.out.println("This is singleton eager instance.");
    }
}

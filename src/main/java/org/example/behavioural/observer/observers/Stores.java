package org.example.behavioural.observer.observers;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Stores implements Observer {
    private String storeName;

    @Override
    public void updateObservers() {
        System.out.println(storeName + " : Product is available for stores now.");
    }
}

package org.example.behavioural.observer.observers;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Customers implements Observer {
    private String customerName;

    @Override
    public void updateObservers() {
        System.out.println(customerName + " : Product is available for customers now.");
    }
}

package org.example.behavioural.observer;

import org.example.behavioural.observer.observables.InStockReminder;
import org.example.behavioural.observer.observers.Customers;
import org.example.behavioural.observer.observers.Observer;
import org.example.behavioural.observer.observers.Stores;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Customers customer1 = new Customers("Customer1");
        Customers customer2 = new Customers("Customer2");
        Stores store1 = new Stores("Store1");
        Stores store2 = new Stores("Store2");

        List<Observer> observers = new ArrayList<>();
        observers.add(customer1);
        observers.add(customer2);
        observers.add(store1);
        observers.add(store2);

        InStockReminder observable = new InStockReminder();
        observable.setObservers(observers);
        observable.setTotalStock(10);
        observable.updateObservers();
    }
}

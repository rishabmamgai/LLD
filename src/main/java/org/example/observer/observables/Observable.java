package org.example.observer.observables;


import org.example.observer.observers.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObservers();
}

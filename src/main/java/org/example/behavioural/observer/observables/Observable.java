package org.example.behavioural.observer.observables;

import org.example.behavioural.observer.observers.Observer;


public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void updateObservers();
}

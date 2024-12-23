package org.example.observer.observables;

import lombok.Getter;
import lombok.Setter;
import org.example.observer.observers.Observer;
import java.util.List;


@Getter
@Setter
public class InStockReminder implements Observable {
    private List<Observer> observers;
    private int totalStock;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers() {
        if (totalStock > 0) {
            for (Observer observer : observers)
                observer.updateObservers();
        }
    }
}

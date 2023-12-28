package LabFinalFA23HaleemaBinteJamil;

import java.util.ArrayList;
import java.util.List;

class Communication {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyStakeholders(String message) {
        // Notify stakeholders using the observer pattern
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

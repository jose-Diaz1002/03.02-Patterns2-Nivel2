package org.example.subject;

import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectBroker {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer agency) {
        observers.add(agency);
    }

    public void removeObserver(Observer agency) {
        observers.remove(agency);
    }


    public void notifyObservers(String status) {
        for (Observer agency : observers) {
            agency.update(status);
        }
    }
}


package org.example.subject;

import org.example.observer.BrokerAgency;

import java.util.ArrayList;
import java.util.List;

public abstract class StockBrokerAgent {

    private List<BrokerAgency> observers = new ArrayList<>();

    public void addObserver(BrokerAgency agency) {
        observers.add(agency);
    }

    public void removeObserver(BrokerAgency agency) {
        observers.remove(agency);
    }


    public void notifyObservers(String status) {
        for (BrokerAgency agency : observers) {
            agency.update(status);
        }
    }
}


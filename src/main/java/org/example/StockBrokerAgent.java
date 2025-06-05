package org.example;

import java.util.ArrayList;
import java.util.List;

public class StockBrokerAgent {
    private List<BrokerAgency> observers = new ArrayList<>();

    public void addObserver(BrokerAgency agency) {
        observers.add(agency);
    }

    public void removeObserver(BrokerAgency agency) {
        observers.remove(agency);
    }

    public void stockMarketUp() {
        notifyObservers("The stock market is going UP");
    }

    public void stockMarketDown() {
        notifyObservers("The stock market is going DOWN");
    }

    private void notifyObservers(String status) {
        for (BrokerAgency agency : observers) {
            agency.update(status);
        }
    }
}


package org.example.subject;

public class Broker extends StockBrokerAgent {

    public void statusActions(String status) {

        notifyObservers(status);

    }


}

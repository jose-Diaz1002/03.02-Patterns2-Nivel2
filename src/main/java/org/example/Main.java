package org.example;

public class Main {
    public static void main(String[] args) {
        StockBrokerAgent agent = new StockBrokerAgent();

        BrokerAgency agency1 = new ConcreteBrokerAgency("Avalon");
        BrokerAgency agency2 = new ConcreteBrokerAgency("Skyline");
        BrokerAgency agency3 = new ConcreteBrokerAgency("Falcon");

        agent.addObserver(agency1);
        agent.addObserver(agency2);
        agent.addObserver(agency3);

        agent.stockMarketUp();
        agent.stockMarketDown();


    }
}
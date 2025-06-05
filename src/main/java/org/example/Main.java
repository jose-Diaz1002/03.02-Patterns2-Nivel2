package org.example;

public class Main {
    public static void main(String[] args) {
        StockBrokerAgent agent = new StockBrokerAgent();

        BrokerAgency agency1 = new ConcreteBrokerAgency("Alpha Finance");
        BrokerAgency agency2 = new ConcreteBrokerAgency("Beta Investments");
        BrokerAgency agency3 = new ConcreteBrokerAgency("Omega Capital");

        agent.addObserver(agency1);
        agent.addObserver(agency2);
        agent.addObserver(agency3);

        agent.stockMarketUp();
        agent.stockMarketDown();


    }
}
package org.example;

import org.example.observer.BrokerAgency;
import org.example.observer.ConcreteBrokerAgency;
import org.example.subject.Broker;

public class Main {
    public static void main(String[] args) {

        // StockBrokerAgent agent = new StockBrokerAgent();

        BrokerAgency agency1 = new ConcreteBrokerAgency("Avalon");
        BrokerAgency agency2 = new ConcreteBrokerAgency("Skyline");
        BrokerAgency agency3 = new ConcreteBrokerAgency("Falcon");
        BrokerAgency agency4 = new ConcreteBrokerAgency("tess");
        BrokerAgency agency5 = new ConcreteBrokerAgency("tlothon");

        Broker agent = new Broker();

        agent.addObserver(agency1);
        agent.addObserver(agency2);
        agent.addObserver(agency3);
        agent.addObserver(agency4);
        agent.addObserver(agency5);


        agent.statusActions("UP");

        System.out.println("------------------------------");

        agent.statusActions("Down");




/*


        agent.stockMarketUp();
        agent.stockMarketDown();

*/

    }
}
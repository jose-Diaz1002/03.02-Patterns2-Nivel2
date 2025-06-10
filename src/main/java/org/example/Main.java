package org.example;

import org.example.observer.AgencyObserver;
import org.example.subject.Broker;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        new AgencyObserver("Avalon", broker);
        new AgencyObserver("Skyline", broker);
        new AgencyObserver("Falcon", broker);
        new AgencyObserver("tess", broker);
        new AgencyObserver("PrimeCore", broker);

        broker.statusActions("UP");
        System.out.println("------------------------------");
        broker.statusActions("Down");
        System.out.println("------------------------------");
        broker.statusActions("UP");


    }

}


package org.example;

import org.example.observer.Observer;
import org.example.observer.AgencyObserver;
import org.example.subject.Broker;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        Observer agency1 = new AgencyObserver("Avalon", broker);
        Observer agency2 = new AgencyObserver("Skyline", broker);
        Observer agency3 = new AgencyObserver("Falcon", broker);
        Observer agency4 = new AgencyObserver("tess", broker);
        Observer agency5 = new AgencyObserver("PrimeCore", broker);

        broker.statusActions("UP");

        System.out.println("------------------------------");

        broker.statusActions("Down");

    }

}
package org.example.observer;

public class ConcreteBrokerAgency extends BrokerAgency {

    private String name;

    public ConcreteBrokerAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String marketStatus) {
        System.out.println("[" + name + "] received market update: " + "The stock market is going [" +marketStatus +"]");

    }
}

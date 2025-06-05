package org.example;

public class ConcreteBrokerAgency extends BrokerAgency{

    private String name;

    public ConcreteBrokerAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String marketStatus) {
        System.out.println("[" + name + "] received market update: " + marketStatus);

    }
}

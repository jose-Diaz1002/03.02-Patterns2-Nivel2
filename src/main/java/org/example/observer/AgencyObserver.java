package org.example.observer;

import org.example.subject.SubjectBroker;

public class AgencyObserver extends Observer {

    private String name;

    public AgencyObserver(String name, SubjectBroker subjectBroker) {
        super(subjectBroker);
        this.name = name;
    }

    @Override
    public void update(String marketStatus) {
        System.out.println("[" + name + "] received market update: " + "The stock market is going [" +marketStatus +"]");

    }
}

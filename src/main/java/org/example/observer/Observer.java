package org.example.observer;

import org.example.subject.SubjectBroker;

public abstract class Observer {

    SubjectBroker subjectBroker;

    public Observer(SubjectBroker subjectBroker) {
        this.subjectBroker = subjectBroker;
        subjectBroker.addObserver(this);
    }

    public abstract void update(String marketStatus);


}

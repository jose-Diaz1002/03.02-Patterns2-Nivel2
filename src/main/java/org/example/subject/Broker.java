package org.example.subject;

public class Broker extends SubjectBroker {

    public void statusActions(String status) {

        notifyObservers(status);

    }


}

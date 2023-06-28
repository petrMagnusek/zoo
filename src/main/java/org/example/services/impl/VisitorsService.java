package org.example.services.impl;

import org.example.items.impl.Visitor;
import org.example.exceptions.VisitorNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class VisitorsService {

    private Set<Visitor> visitors;


    public int getHighestID() {
        if (visitors.isEmpty()) {
            return 0;
        } else {
            return visitors.stream().mapToInt(v -> v.getId()).max().getAsInt();
        }
    }

    public void addVisitor(String name, String surname, int credits) {
        int id = getHighestID() + 1;
        visitors.add(new Visitor(id, name, surname, credits));
    }


    public VisitorsService() {
        visitors = new HashSet<>();
    }

    public void enterZoo(int id) throws VisitorNotFoundException {
        Visitor visitor = visitors.stream().filter(v -> id == v.getId()).findAny().orElse(null);
        if (visitor == null) {
            throw new VisitorNotFoundException("Visitor not found!");
        } else if (visitor.getCredits() < 2) {
            System.out.println("Visitor " + visitor.getName() + " " + visitor.getSurname() + " cannot ener ZOO, because low of credits!");;
        } else {
            System.out.println("Visitor " + visitor.getName() + " " + visitor.getSurname() + " entered ZOO");
        }
    }

    public Set<Visitor> getVisitors() {
        return visitors;
    }
}

package org.example.items.impl;

import org.example.services.impl.VisitorsService;

import java.util.Objects;

public class Visitor {

    private String name;
    private String surname;
    private int credits;
    private int id;

    public Visitor(int id, String name, String surname, int credits) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return id == visitor.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nID: " + this.id + "\nCredit: " +
                this.credits;
    }
}

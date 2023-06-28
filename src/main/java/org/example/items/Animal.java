package org.example.items;

import org.example.items.impl.Bird;

import java.util.Objects;

public abstract class Animal {

    private String name;

    private Double weight;


    public Animal(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract String getSpecies();

    public String getName() {
        return name;
        }

    public void setName(String name) {
        this.name = name;
        }

    public Double getWeight() {
        return weight;
        }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getName().equals(animal.getName()) && getWeight().equals(animal.getWeight());
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nWeight: " + this.weight + "\nSpecies: " + getSpecies();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }

}

package org.example.items.impl;

import org.example.items.Animal;

public class Mammal extends Animal {

    public Mammal(String name, Double weight) {
        super(name, weight);
    }

    public String getSpecies() {
        return "Mammal";
    }
}

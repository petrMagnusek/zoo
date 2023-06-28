package org.example.items.impl;

import org.example.items.Animal;

public class Reptile extends Animal {

    public Reptile(String name, Double weight) {
        super(name, weight);
    }

    public String getSpecies() {
        return "Reptile";
    }
}

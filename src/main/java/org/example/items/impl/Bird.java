package org.example.items.impl;

import org.example.items.Animal;

import java.util.Objects;

public class Bird extends Animal {

    public Bird(String name, Double weight) {
        super(name, weight);
    }

    public String getSpecies() {
        return "Bird";
    }
}

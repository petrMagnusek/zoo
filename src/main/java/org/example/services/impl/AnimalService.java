package org.example.services.impl;

import org.example.items.Animal;
import org.example.items.impl.Bird;
import org.example.items.impl.Employee;

import java.util.*;

public class AnimalService  {

    private List<Animal> animals;
    private Map<Animal, Set<Employee>> caredBy;

    public AnimalService() {
        animals = new ArrayList<>();
        caredBy = new HashMap<>();
    }

    public void addToList(Animal item, Set<Employee> employees) {
        animals.add(item);
        caredBy.put(item, employees);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Map<Animal, Set<Employee>> getCaredBy() {
        return caredBy;
    }

}

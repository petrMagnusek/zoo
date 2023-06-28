package org.example;

import org.example.exceptions.VisitorNotFoundException;
import org.example.items.Animal;
import org.example.items.impl.*;
import org.example.services.impl.AnimalService;
import org.example.services.impl.EmployeeService;
import org.example.services.impl.VisitorsService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        AnimalService animalService = new AnimalService();
        VisitorsService visitorsService = new VisitorsService();

        //vytvorim zamestnance
        Employee e1 = new Employee("Karel", "Novak", "karel.novak@novak.cz", "14354534543", 23500.0);
        Employee e2 = new Employee("Franta", "Vanek", "vanek@seznam.cz", "14354543", 70500.0);
        Employee e3 = new Employee("Petr", "Janku", "janku@gmail.com", "12222223", 28500.0);
        Employee e4 = new Employee("Lenka", "Hajna", "hajna@seznam.cz", "143545311111", 33500.0);

        //pridam je do seznamu zamestnancu
        employeeService.addToList(e1);
        employeeService.addToList(e2);
        employeeService.addToList(e3);
        employeeService.addToList(e4);

        //pro nektere zaloguju praci
        employeeService.logTime(12.3, e1);
        employeeService.logTime(1.0, e1);
        employeeService.logTime(4.0, e2);

        //vytvorim zvirata
        Animal ptak1 = new Bird("ptak1", 22.3);
        Animal ptak2 = new Bird("ptak2", 43.2);
        Animal plaz1 = new Reptile("plaz1", 10.0);
        Animal savec1 = new Mammal("savec1", 12.0);

        //pridam zvirata do list
        Set<Employee> empsForPtak1 = new HashSet<>();
        Set<Employee> empsForPtak2 = new HashSet<>();
        Set<Employee> empsForPlaz1 = new HashSet<>();
        Set<Employee> empsForSavec1 = new HashSet<>();

        empsForPtak1.add(e1);
        empsForPtak1.add(e2);
        empsForPtak2.add(e2);
        empsForPlaz1.add(e1);
        empsForSavec1.add(e4);
        empsForSavec1.add(e3);

        animalService.addToList(plaz1, empsForPlaz1);
        animalService.addToList(ptak1, empsForPtak1);
        animalService.addToList(ptak2, empsForPtak2);
        animalService.addToList(savec1, empsForSavec1);


        //pridam navstevniky
        visitorsService.addVisitor("Petr", "Visitor1", 100);
        visitorsService.addVisitor("Karel", "Visitor2", 1);
        visitorsService.addVisitor("Ludek", "Visitor3", 10);
        visitorsService.addVisitor("Tomas", "Visitor4", 10);


        //vytisknu vsechna registrovana zvirata + kdo se o ne stara
        System.out.println("Zvirata: ");
        animalService.getAnimals().forEach(it -> System.out.println(it.toString() + "\n" + "CarredBy: " +
                animalService.getCaredBy().get(it).stream().map(e -> e.getSurname()).collect(Collectors.joining(",")) + "\n"));

        //vytisknu zamestnance i se zalogovanou praci
        System.out.println("Zamestnanci: ");
        employeeService.getEmployees().forEach(it -> System.out.println(it.toString() + "\n" + "LoggedTime: " + employeeService.getLoggedTime(it) + "\n"));


        //vytisknu vsechny navstevniky
        System.out.println("Navstevnici: ");
        visitorsService.getVisitors().forEach(it -> System.out.println(it.toString()));

        //pokusim se vstoupit do zoo navstevnikem s dostatkem kreditu:
        System.out.println("\nVstupuji do zoo navstevnikem s kreditem 10:");
        try {
            visitorsService.enterZoo(4);
        } catch (VisitorNotFoundException e) {
            throw new RuntimeException(e);
        }

        //pokusim se vstoupit do zoo navstevnikem s NEDOSTATKEM kreditu:
        System.out.println("\nVstupuji do zoo navstevnikem s kreditem 1:");
        try {
            visitorsService.enterZoo(2);
        } catch (VisitorNotFoundException e) {
            throw new RuntimeException(e);
        }


        //pokusim se vstoupit do zoo s neexistujicim navstevnikem:
        System.out.println("\nVstupuji do zoo s neexistujicim navstevnikem:");
        try {
            visitorsService.enterZoo(5);
        } catch (VisitorNotFoundException e) {
            System.out.println(e.getMessage());
        }



    }
}
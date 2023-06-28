package org.example.items.impl;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private Double salary;

    public Employee(String name, String surname, String email, String phone, Double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nSurname: " + this.surname + "\nEmail: " + this.email + "\nPhone: " +
                this.phone + "\nSalary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getName().equals(employee.getName()) && getSurname().equals(employee.getSurname()) && getEmail().equals(employee.getEmail()) && getPhone().equals(employee.getPhone()) && getSalary().equals(employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getEmail(), getPhone(), getSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

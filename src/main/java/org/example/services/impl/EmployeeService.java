package org.example.services.impl;

import org.example.items.impl.Employee;
import org.example.items.impl.TimeLog;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees;
    private List<TimeLog> logs;

    public EmployeeService() {
        employees = new ArrayList<>();
        logs = new ArrayList<>();
    }

    public void addToList(Employee item) {
        employees.add(item);
    }

    public void logTime(Double hours, Employee e) {
        logs.add(new TimeLog(hours, e));
    }

    public Double getLoggedTime(Employee e) {
        return logs.stream().filter(it -> it.getE().equals(e)).mapToDouble(emp -> emp.getHours()).sum();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

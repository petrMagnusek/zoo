package org.example.items.impl;

import java.util.Objects;

public class TimeLog {

    private Double hours;

    public Employee getE() {
        return e;
    }

    private Employee e;

    public Double getHours() {
        return hours;
    }

    public TimeLog(Double hours, Employee e) {
        this.hours = hours;
        this.e = e;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeLog timeLog = (TimeLog) o;
        return getHours().equals(timeLog.getHours()) && e.equals(timeLog.e);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHours(), e);
    }
}

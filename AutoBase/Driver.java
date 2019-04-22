package com.marchello.labs.AutoBase;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }
    public String toString() {
        return "Водитель: " + name + ", ";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        if (!name.equals(driver.name)) return false;
        return true;
    }
    public int hashCode() {
        return name.hashCode();
    }
}

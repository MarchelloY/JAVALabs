package com.marchello.labs.AutoBase;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    public String toString() {
        return "Машина: " + name + "}";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        if (!name.equals(car.name)) return false;
        return true;
    }
    public int hashCode() {
        return name.hashCode();
    }
}

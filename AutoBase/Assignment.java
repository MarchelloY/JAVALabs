package com.marchello.labs.AutoBase;

public class Assignment {
    private Passage passage;
    private Driver driver;
    private Car car;

    public Assignment(Passage passage, Driver driver, Car car) {
        this.passage = passage;
        this.driver = driver;
        this.car = car;
    }
    public Driver getDriver() {
        return driver;
    }
    public Car getCar() {
        return car;
    }
    public String toString() {
        return "{Заказ: " + passage + driver + car;
    }
}

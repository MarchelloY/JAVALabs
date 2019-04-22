package com.marchello.labs.AutoBase;

import java.util.*;
import java.util.stream.Collectors;

public class Dispatcher {
    private Set<Driver> drivers;
    private Set<Car> car;
    private Set<Driver> unavailableDrivers = new HashSet<>();
    private Set<Car> unavailableCar = new HashSet<>();
    private Set<Assignment> assignments = new HashSet<>();

    public Dispatcher(Set<Driver> drivers, Set<Car> car) {
        this.drivers = drivers;
        this.car = car;
    }
    public <T> Set<T> remove(Set<T> a, Set<T> ... b) {
        Set<T> result = new HashSet<>(a);
        for (Set<T> set : b) {
            result.removeAll(set);
        }
        /*for (int i=0; i< b.length; i++){
            Set<T> set = b[i];
            result.removeAll(set);
        }*/
        return result;
    }
    private Driver getFreeDriver() {
        Set<Driver> usedDrivers = assignments.stream().map(o -> o.getDriver()).collect(Collectors.toSet());
        Set<Driver> freeDrivers = remove(drivers, usedDrivers, unavailableDrivers);
        if (freeDrivers.isEmpty()) {
            throw new IllegalStateException("нет свободных водителей");
        }
        return freeDrivers.iterator().next();
    }
    private Car getFreeCar() {
        Set<Car> usedCar = assignments.stream().map(o -> o.getCar()).collect(Collectors.toSet());
        Set<Car> freeCar = remove(car, usedCar, unavailableCar);
        if (freeCar.isEmpty()) {
            throw new IllegalStateException("нет свободных транспортных средств");
        }
        return freeCar.iterator().next();
    }
    public Assignment addAssignment(Passage passage) {
        Driver driver = getFreeDriver();
        Car car = getFreeCar();
        Assignment assignment = new Assignment(passage, driver, car);
        assignments.add(assignment);
        return assignment;
    }
    public void removeAssignment(Assignment assignment) {
        if (assignments.contains(assignment)) {
            assignments.remove(assignment);
        }
    }
    public void DriverUnavailable(Driver driver) {
        unavailableDrivers.add(driver);
    }
    public void CarUnavailable(Car car) {
        unavailableCar.add(car);
    }
    public Collection<Assignment> getAssignments() {
        return assignments;
    }
}

package com.marchello.labs.City;

public class Main {
    static public void main(String[]args)
    {
        City city1 = new City("Новогрудок");
        city1.setStreet();
        city1.setAvenue();
        city1.setSquare();
        City city2 = new City("Минск");
        city2.setStreet();
        city2.setAvenue();
        city2.setSquare();
        city1.print();
        city2.print();
    }
}

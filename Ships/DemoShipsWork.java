package com.marchello.labs.Ships;

public class DemoShipsWork {
    public static void main(String[] args) {
        Ship [] ships = new Ship[4];
        ships[0] = new CargoShip("Barja 1", 500, 13,  4);
        ships[1] = new Tanker("Tanker 1", 20000, 30,  200);
        ships[2] = new CargoShip("Barja 2", 600, 17,  6);
        ships[3] = new Tanker("Tanker 2", 2000, 20,100);
        for (Ship tmpSh : ships)
            System.out.println(tmpSh);
    }
}
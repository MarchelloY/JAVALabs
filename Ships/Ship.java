package com.marchello.labs.Ships;

public abstract class Ship implements DoingShips {
    protected String name;
    private int maxSpeed;
    private int distanatMax;
    public Ship(String name, int maxSpeed, int distanatMax) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.distanatMax = distanatMax;
    }
    public int getMaxSpeed() { return maxSpeed; }
    public int getDistanatMax() { return distanatMax; }
}

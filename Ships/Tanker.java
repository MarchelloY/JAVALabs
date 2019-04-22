package com.marchello.labs.Ships;

public class Tanker extends Ship{
    private int volume;
    public Tanker(String name,int maxSpeed,int distanatMax,int volume) {
        super(name, maxSpeed, distanatMax);
        this.volume=volume;
    }
    public String toString() {
        return "name='" + name + "\';\n" +
                "Максимальная дальность плаванья =" + getDistanatMax() + " км.\n" +
                "Максимальная скорость = " + getMaxSpeed() + " узлов \n" +
                "Вместимость = " + volume + " литров\n" +
                "_______________________________________________________";
    }
}

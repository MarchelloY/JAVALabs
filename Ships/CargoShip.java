package com.marchello.labs.Ships;

public class CargoShip extends Ship {
    private String typeLoading = "Требуется портовый кран";
    protected int numberOfTeam;
    public CargoShip(String name, int maxSpeed, int distanatMax, int numberOfTeam) {
        super(name, maxSpeed, distanatMax);
        this.numberOfTeam = numberOfTeam;
    }
    public String toString() {
        return "name='" + name + "\';\n" +
                "Тип погрузки '" + typeLoading + "\';\n" +
                "Численность экипажа = " + numberOfTeam + ";\n" +
                "Максимальная дальность плаванья = " + getDistanatMax() + " км.\n" +
                "Максимальная скорость = " + getMaxSpeed() + " узлов \n" +
                "_______________________________________________________";
    }
}
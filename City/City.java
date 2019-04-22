package com.marchello.labs.City;

import java.util.Scanner;

public class City {
    private String nameCity;
    private Street [] streetArray;
    private Avenue [] avenueArray;
    private Square [] squareArray;
    public City(String nameCity) {
        this.nameCity=nameCity;
    }
    public void print(){
        System.out.print("\n\n==============================\nГород: " + this.nameCity + "\n==============================\nКоличество улиц: " + streetArray.length);
        for(int i = 0; i < streetArray.length; i++)
        {
            System.out.print("\nУлица " + (i+1)+ ": " + streetArray[i]);
        }
        System.out.print("\n==============================\nКоличество проспектов: " + avenueArray.length);
        for(int i = 0; i < avenueArray.length; i++)
        {
            System.out.print("\nПроспект " + (i+1)+ ": " + avenueArray[i]);
        }
        System.out.print("\n==============================\nКоличество площадей: " + squareArray.length);
        for(int i = 0; i < squareArray.length; i++)
        {
            System.out.print("\nПлощадь " + (i+1)+ ": " + squareArray[i]);
        }
        System.out.print("\n==============================");
    }
    private class Street {
        private String nameStreet;
        public Street(String nameStreet)
        {
            this.nameStreet=nameStreet;
        }
        public String toString(){
            return this.nameStreet;
        }
    }
    private class Avenue {
        private String nameAvenue;
        public Avenue(String nameAvenue)
        {
            this.nameAvenue=nameAvenue;
        }
        public String toString(){
            return this.nameAvenue;
        }
    }
    private class Square {
        private String nameSquare;
        public Square(String nameSquare)
        {
            this.nameSquare=nameSquare;
        }
        public String toString(){
            return this.nameSquare;
        }
    }
    public void setStreet() {
        System.out.print("Введите количество улиц для города " + this.nameCity + ": ");
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        streetArray = new Street[dim];
        for(int i = 0; i < dim; i++)
        {
            System.out.println("Улица " + (i+1) + ": ");String nameStr = scanner.next();
            streetArray[i] = new Street(nameStr);
        }
    }
    public void setAvenue() {
        System.out.print("Введите количество проспектов для города " + this.nameCity + ": ");
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        avenueArray = new Avenue[dim];
        for(int i = 0; i < dim; i++)
        {
            System.out.println("Проспект " + (i+1) + ": ");String nameStr = scanner.next();
            avenueArray[i] = new Avenue(nameStr);
        }
    }
    public void setSquare() {
        System.out.print("Введите количество площадей для города " + this.nameCity + ": ");
        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        squareArray = new Square[dim];
        for(int i = 0; i < dim; i++)
        {
            System.out.println("Площадь " + (i+1) + ": ");String nameStr = scanner.next();
            squareArray[i] = new Square(nameStr);
        }
    }
}

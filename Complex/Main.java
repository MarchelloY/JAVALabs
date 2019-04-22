package com.marchello.labs.Complex;

public class Main {
    public static void main(String[] args){
        Complex result, z1 = new Complex(2,3), z2 = new Complex(-1);
        System.out.print("Тестирование операций:\n");
        System.out.print("z1 = "); z1.pr();
        System.out.print("z2 = "); z2.pr();
        result=z1.plus(z2);
        System.out.print("Сложение = " + result + "\n");
        result=z1.minus(z2);
        System.out.print("Разность = " + result + "\n");
        result=z1.mul(z2);
        System.out.print("Умножение = " + result + "\n");
        result=z1.div(z2);
        System.out.print("Деление = " + result + "\n");
        Complex.equal(z1,z2);
        System.out.print("Присваивание:\nz1= " + z1 + "\nz2= " + z2 + "\n");
        Complex[] vector1 = new Complex [5];
        vector1[0] = new Complex(1);
        vector1[1] = new Complex(1,3);
        vector1[2] = new Complex(1,6);
        vector1[3] = new Complex(-1,-2);
        vector1[4] = new Complex(-1,-2);
        Complex[] vector2 = new Complex [5];
        vector2[0] = new Complex(3);
        vector2[1] = new Complex(5,1);
        vector2[2] = new Complex(-1,6);
        vector2[3] = new Complex(-1,2);
        vector2[4] = new Complex(-1,-2);
        System.out.print("Сложение векторов:\n");
        Complex.sumVec(vector1,vector2);
    }
}

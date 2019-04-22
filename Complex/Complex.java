package com.marchello.labs.Complex;

/*
8) Определить класс Комплекс.
Класс должен содержать несколько конструкторов.
Реализовать методы для сложения, вычитания, умножения, деления, присваивания комплексных чисел.
Создать два вектора размерности n из комплексных координат.
Передать их в метод, который выполнит их сложение.
*/

public class Complex
{
    private double re, im;
    /*private Complex()
    {
        this(0.0, 0.0);
    }*/
    public Complex(double re, double im)
    {
        this.re = re;
        this.im = im;
    }
    public Complex(double re)
    {
        this(re, 0.0);
    }
    public void pr()
    {
        System.out.println(re + (im < 0.0 ? "" : "+") + im + "i");
    }
    public Complex plus(Complex z)
    {
        return new Complex(re + z.re, im + z.im);
    }
    public Complex minus(Complex z)
    {
        return new Complex(re - z.re, im - z.im);
    }
    public Complex mul(Complex z)
    {
        return new Complex(re*z.re-im*z.im, re*z.im+im*z.re);
    }
    public Complex div(Complex z)
    {
        return new Complex((re*z.re-im*z.im)/(z.re*z.re+z.im*z.im), (re*z.im+im*z.re)/(z.re*z.re+z.im*z.im));
    }
    public static void equal(Complex x, Complex y)
    {
        x.re = y.re;
        x.im = y.im;
    }
    public static void sumVec (Complex[] x, Complex[] y){
        int size= x.length;
        double[] sumRe= new double [size];
        double[] sumIm= new double [size];
        for(int i=0;i<size;i++){
            sumRe[i]=x[i].re+y[i].re;
            sumIm[i]=x[i].im+y[i].im;
        }
        for(int k=0;k<size;k++) {
            if(k==0)System.out.print("Vec1 = ("+ x[k].re + (x[k].im < 0.0 ? "" : "+") + x[k].im + "i, ");
            if(k!=0&&k!=(size-1))System.out.print(x[k].re + (x[k].im < 0.0 ? "" : "+") + x[k].im + "i, ");
            if(k==(size-1))System.out.print(x[k].re + (x[k].im < 0.0 ? "" : "+") + x[k].im + "i)\n");
        }
        for(int l=0;l<size;l++) {
            if(l==0)System.out.print("Vec2 = ("+ y[l].re + (y[l].im < 0.0 ? "" : "+") + y[l].im + "i, ");
            if(l!=0&&l!=(size-1))System.out.print(y[l].re + (y[l].im < 0.0 ? "" : "+") + y[l].im + "i, ");
            if(l==(size-1))System.out.print(y[l].re + (y[l].im < 0.0 ? "" : "+") + y[l].im + "i) \n");
        }
        for(int j=0;j<size;j++) {
            if(j==0)System.out.print("SumV = ("+ sumRe[j] + (sumIm[j] < 0.0 ? "" : "+") + sumIm[j] + "i, ");
            if(j!=0&&j!=(size-1))System.out.print(sumRe[j] + (sumIm[j] < 0.0 ? "" : "+") + sumIm[j] + "i, ");
            if(j==(size-1))System.out.print(sumRe[j] + (sumIm[j] < 0.0 ? "" : "+") + sumIm[j] + "i)");
        }
    }
    public String toString()
    {
        return re + (im < 0.0 ? "" : "+") + im + "i";
    }
}

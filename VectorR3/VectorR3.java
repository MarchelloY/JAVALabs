package com.marchello.labs.VectorR3;

public class VectorR3
{
    private double x,y,z;
    public VectorR3(double x, double y, double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    private double length()
    {
        return Math.sqrt(x*x+y*y+z*z);
    }
    public Boolean orthQ (VectorR3 other)
    {
        return x*other.x+y*other.y+z*other.z==0;
    }
    private double getCosAngle (VectorR3 other)
    {
        return (x*other.x+y*other.y+z*other.z)/(this.length()*other.length());
    }
    public double getDEGAngle (VectorR3 other)
    {
        return (int) (Math.acos(this.getCosAngle(other))*180/Math.PI);
    }
    public String compare (VectorR3 other)
    {
        if(this.length()==other.length()) return "Векторы равны";
        if(this.length()>other.length()) return "Первый вектор больше";
        return "Второй вектор больше";
    }
    public String toString()
    {
        return "Вектор: (" + this.x + ',' + this.y + ',' + this.z + ")\n";
    }
}

package com.marchello.labs.VectorR3;

public class Main
{
    public static void main(String[] args)
    {
        VectorR3 vector1 = new VectorR3(1,0,0);
        VectorR3 vector2 = new VectorR3(1,1,0);
        System.out.print(vector1);
        System.out.print(vector2);
        String text = vector1.orthQ(vector2)?"Ортогональные":"Не ортогональные";
        System.out.print(text);
        System.out.print("\nУгол между векторами: ");
        System.out.println(vector1.getDEGAngle(vector2));
        System.out.println(vector1.compare(vector2));
    }
}

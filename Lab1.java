package com.marchello.labs;

import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        System.out.print("Количество чисел: ");
        Scanner in = new Scanner(System.in);
        if (in.nextInt() == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        int[] sourceNumbers = new int[in.nextInt()];
        System.out.print("Введите целые числа: ");
        for (int i = 0; i < in.nextInt(); i++) {
            sourceNumbers[i] = in.nextInt();
        }
        List result = new ArrayList();
        for (Integer NUMBER : sourceNumbers) {
            if (isPolindromNumber(NUMBER.toString())) {
                result.add(NUMBER);
            }
        }
        System.out.println("Полиндромы: " + result);
    }
    public static boolean isPolindromNumber(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
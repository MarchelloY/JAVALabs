package com.marchello.labs.Lab10;

/*
8. Определить множество на основе множества целых чисел. Создать методы
для определения пересечения и объединения множеств.
*/

public class Main {
    public static void main(String[] args) {
        MySet set1 = new MySet(1, 2, 3);
        MySet set2 = new MySet(2, 3, 4, 5);
        System.out.println("Объединение: " + set1.unify(set2));
        System.out.println("Пересечение: " + set1.intersect(set2));
    }
}

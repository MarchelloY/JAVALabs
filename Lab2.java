package com.marchello.labs;
import java.util.*;

/*Ввести с консоли n – размерность матрицы a[n][n].
Задать значения элемен-тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-сел.
8)Вычислить определитель матрицы.*/

public class Lab2 {
    public static void main(String[] args) {
        Lab2 e2 = new Lab2();
        System.out.print("Введите число n: ");
        Scanner n = new Scanner(System.in);
        int size = n.nextInt();
        int[][] array = e2.getMatrix(size);
        System.out.println("Матрица: ");
        e2.pr(array);
    }
    private int[][] getMatrix(int x) {
        int[][] result = new int[x][x];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (-x + Math.random() * 2 * x);
            }
        }
        return result;
    }
    private void pr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
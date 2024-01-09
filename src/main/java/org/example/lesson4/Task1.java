package org.example.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /**
     * Задача 1:
     * Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.
     */
    public static void main(String[] args) {
        double[] arr = new double[5];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int a = random.nextInt(10);
            System.out.print(a + " ");
            arr[i] = Math.pow(a, 2);
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}

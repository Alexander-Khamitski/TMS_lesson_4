package org.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    /**
     * Задача 5:
     * Пройти по массиву и поменять местами элементы первый и последний, второй и
     * предпоследний и т.д.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        scanner.close();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arrayLength / 2; i++) {
            int a = arr[i];
            int b = arr[arrayLength - 1 - i];
            arr[i] = b;
            arr[arrayLength - 1 - i] = a;
        }
        System.out.println("Edited array: " + Arrays.toString(arr));
    }
}

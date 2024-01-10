package org.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /**
     * Задача 2:
     * Найти минимальный-максимальный элементы и вывести в консоль.
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

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min value in array: " + min);
        System.out.println("Max value in array: " + max);
    }
}

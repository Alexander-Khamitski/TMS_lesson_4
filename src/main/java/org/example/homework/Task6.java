package org.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    /**
     * Задача 6:
     * Проверить, является ли массив возрастающей последовательностью (каждое следующее
     * число больше предыдущего).
     */
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Enter element #'%d' of '%d': ", i, arrayLength - 1);
            System.out.println();
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Original array: " + Arrays.toString(arr));
        boolean isArrayIncreasing = true;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isArrayIncreasing = false;
                break;
            }
        }
        System.out.println("Is array increasing: " + isArrayIncreasing);
    }
}

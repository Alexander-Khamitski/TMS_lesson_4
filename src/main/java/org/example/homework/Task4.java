package org.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /**
     * Задача 4:
     * Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
     * сообщение, что их нет.
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
        int numberOfZeroValues = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == 0) {
                numberOfZeroValues += 1;
            }
        }
        System.out.println("Number of zero values is: " + numberOfZeroValues);
    }
}

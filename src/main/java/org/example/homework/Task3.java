package org.example.homework;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    /**
     * Задача 3:
     * Найти индексы минимального и максимального элементов и вывести в консоль.
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
        //additional solution
        System.out.printf("Index of min element %d is: '%d'",
                min, ArrayUtils.indexOf(arr, Arrays.stream(arr).min().getAsInt()));
        System.out.printf("Index of max element %d is: '%d'",
                max, ArrayUtils.indexOf(arr, Arrays.stream(arr).max().getAsInt()));

        //works unstable
        System.out.println("Min value in array: " + min);
        System.out.printf("Index of min element %d is: '%d'", min, Arrays.binarySearch(arr, max));
        System.out.println();
        System.out.println("Max value in array: " + max);
        System.out.printf("Index of max element %d is: '%d'", max, Arrays.binarySearch(arr, max));
        System.out.println();

        //works stable with sorted array
        Arrays.sort(arr);
        System.out.printf("Index of min element %d is: '%d'", min, Arrays.binarySearch(arr, max));
        System.out.println();
        System.out.printf("Index of max element %d is: '%d'", max, Arrays.binarySearch(arr, max));
        System.out.println();
    }
}

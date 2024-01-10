package org.example.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /**
     * Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
     * массива (просто целое число). После того, как размер массива задан, заполнить его
     * одним из двух способов: используя Math.random(), или каждый элемент массива вводится
     * пользователем вручную. Попробовать оба варианта. После заполнения массива
     * данными, решить для него следующие задачи:
     *
     * Задача 1:
     * Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
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

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arrayLength - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

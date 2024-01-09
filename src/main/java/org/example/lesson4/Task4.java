package org.example.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /**
     * Задача 3:
     * 3.1 Создать пустой массив типа double с названием masDouble такого размера, который
     * пользователь вводит с клавиатуры.
     * 3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
     * консоль.
     * 3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
     * обратном порядке
     */
    public static void main(String[] args) {
        //3.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        scanner.close();

        //3.2
        double[] arr = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = Math.random();
        }
        System.out.println("3.2: " + Arrays.toString(arr));

        //3.3
        for (int i = 1; i < arrayLength; i += 2) {
            arr[i] = Math.pow(arr[i], 2);
        }
        System.out.println("3.3: " + Arrays.toString(arr));

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        for (int i = arrayLength - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}

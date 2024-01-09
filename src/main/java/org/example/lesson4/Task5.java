package org.example.lesson4;

import java.util.Arrays;

public class Task5 {
    /**
     * Задача *:
     * Имеется массив из неотрицательных чисел(любой). Представьте что массив
     * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
     * добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
     * содержит нуля в начале, кроме самого числа 0.
     * Пример:
     * Input: [1,4,0,5,6,3]
     * Output: [1,4,0,5,6,4]
     * Input: [9,9,9]
     * Output: [1,0,0,0]
     */
    public static void main(String[] args) {
        int[] input1 = new int[]{1, 4, 0, 5, 6, 3};
        int[] output1 = addOne(input1);
        System.out.println(Arrays.toString(output1));

        int[] input2 = new int[]{9, 9, 9};
        int[] output2 = addOne(input2);
        System.out.println(Arrays.toString(output2));
    }

    public static int[] addOne(final int[] arr) {
        //1. convert array to string variable
        String numberAsString = "";
        for (int i = 0; i < arr.length; i++) {
            numberAsString += arr[i];
        }

        //2. convert string variable to int and add one
        int number = Integer.parseInt(numberAsString);
        number += 1;

        //3. convert number to string variable
        numberAsString = String.valueOf(number);

        //4. create expected array with correct length
        int[] expectedArray = new int[numberAsString.length()];

        //5. get str[] from string variable
        String[] str = numberAsString.split("");

        //6. set each array element
        for (int i = 0; i < numberAsString.length(); i++) {
            expectedArray[i] = Integer.parseInt(str[i]);
        }
        return expectedArray;
    }
}

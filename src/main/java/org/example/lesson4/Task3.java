package org.example.lesson4;

import java.util.Arrays;

public class Task3 {
    /**
     * Задача 2:
     * 2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
     * 2.2 вывести в консоль второй и четвертый.
     * 2.3 вывести в консоль длину массива.
     * 2.4 третий фрукт заменить на иной.
     * 2.5 проверить результат в консоли.
     */
    public static void main(String[] args) {
        String[] fruits = new String[]{"Banana", "Apple", "Pineapple", "Watermelon"};
        System.out.println(fruits[1] + ", " + fruits[3]);
        System.out.println("Length is: " + fruits.length);
        fruits[2] = "Pomegranate";
        System.out.println(Arrays.toString(fruits));
    }
}

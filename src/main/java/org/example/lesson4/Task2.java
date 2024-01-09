package org.example.lesson4;

public class Task2 {
    /**
     * Реализуйте функцию генерации случайного числа от и до заданных значений
     */
    public static void main(String[] args) {
        System.out.println(generateNumber(10, 1000));
    }

    public static int generateNumber(int min, int max) {
//        boolean withinRange = false;
//        int number = 0;
//        while (!withinRange) {
//            number = (int) (Math.random() * 10);
//            if (number >= min && number <= max) {
//                withinRange = true;
//            }
//        }
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

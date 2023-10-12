/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку, далее определите и выведите на экран сообщение
о том, является ли массив строго возрастающей последовательностью
*/

package ru.mirea.lab3.task3;

import java.util.Random;

public class TesterTask3 {
    public static void main(String[] args) {

        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.print("Случайный массив: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

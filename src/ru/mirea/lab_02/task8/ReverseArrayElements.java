/*
Напишите программу, которая меняет местами элементы
одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
 */

package ru.mirea.lab_02.task8;

import java.util.Scanner;

public class ReverseArrayElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите элементы массива в строку через пробел: ");
        String input = scanner.nextLine();

        String[] strArray = input.split(" ");

        System.out.println("Исходный массив:");
        for (String element : strArray) {
            System.out.print(element + " ");
        }

        reverseArray(strArray);

        System.out.println("\nМассив после обмена элементов в обратном порядке:");
        for (String element : strArray) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(String[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
}


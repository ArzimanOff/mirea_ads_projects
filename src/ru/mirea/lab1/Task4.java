/*
Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на экран.
*/

package ru.mirea.lab1;

import java.util.Scanner;

public class Task4  extends AbstractTask {
    int size; // Размер массива
    int max; // Максимальный элемент массива
    int min; // Минимальный элемент массива
    int sum_while = 0;
    int sum_do_while = 0;
    int[] numbers; // Массив

    Task4(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void run() {
        size = inputArraySize();
        numbers = fillArray(size);
        max = findMaxElementOfArray(numbers);
        min = findMinElementOfArray(numbers);
        sum_while = sumOfArrayElementsUsingWhile(numbers);
        sum_do_while = sumOfArrayElementsUsingDoWhile(numbers);

        System.out.println("Сумма элементов массива 1: " + sum_while);
        System.out.println("Сумма элементов массива 2: " + sum_do_while);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }

    public int inputArraySize() {
        int n;
        while (true) {
            System.out.println("Введите размер массива: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Размер массива должен быть положительным числом.");
                }
            } else {
                System.out.println("Пожалуйста, введите целое число для размера массива.");
                scanner.next(); // Очистка ввода
            }
        }

        return n;
    }

    public int[] fillArray(int size) {
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    array[i] = scanner.nextInt();
                    break; // Элемент массива введен корректно
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Пожалуйста, введите целое число для элемента массива.");
                    scanner.next(); // Очистка ввода
                }
            }
        }

        return array;
    }

    public int findMaxElementOfArray(int[] array) {
        int max = 0;
        if (array != null) {
            max = array[0];

            for (int element : array) {
                max = (element > max) ? element : max;
            }
        }


        return max;
    }

    public int findMinElementOfArray(int[] array) {
        int min = 0;
        if (array != null) {
            min = array[0];

            for (int element : array) {
                min = (element < min) ? element : min;
            }
        }
        return min;
    }

    public int sumOfArrayElementsUsingWhile(int[] array) {
        int i = 0;
        int sum = 0;
        if (array != null) {
            while (i != array.length) {
                sum += array[i];
                i++;
            }
        }

        return sum;
    }

    public int sumOfArrayElementsUsingDoWhile(int[] array) {
        int i = 0;
        int sum = 0;
        if (array != null) {
            do {
                sum += array[i];
                i++;
            } while (i != array.length);
        }

        return sum;
    }
}

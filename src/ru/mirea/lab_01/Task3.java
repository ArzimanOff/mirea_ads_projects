/*
Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for.
*/

package ru.mirea.lab_01;

import java.util.Scanner;

public class Task3 extends AbstractTask {
    int size; // Размер массива
    int sum; // Сумма элементов массива
    int[] numbers; // Массив
    double average; // Среднее арифметическое элементов массива

    Task3(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void run() {
        size = inputArraySize();
        numbers = fillArray(size);
        sum = sumOfArrayElements(numbers);
        average = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
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

    public int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return sum;
    }

    public static void printArray(int[] array) {
        if (array != null) {
            for (int elem : array) {
                System.out.print(elem + " ");
            }
        }
    }

}
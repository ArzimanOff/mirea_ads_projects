/*
Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два подхода
к генерации случайных чисел – метод random() класса Math и класс Random)
*/

package ru.mirea.lab3.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArraySorting {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int arraySize = inputArraySize();

        // Генерация массива с использованием метода Math.random()
        double[] randomArray1 = generateRandomArrayUsingMathRandom(arraySize);
        // Генерация массива с использованием класса Random
        double[] randomArray2 = generateRandomArrayUsingRandomClass(arraySize);

        // C использованием метода Math.random()
        System.out.println("Исходный массив (Math.random()):");
        printArray(randomArray1);
        Arrays.sort(randomArray1);
        System.out.println("Отсортированный массив (Math.random()):");
        printArray(randomArray1);

        // C использованием класса Random
        System.out.println("Исходный массив (Random класс):");
        printArray(randomArray2);
        Arrays.sort(randomArray2);
        System.out.println("Отсортированный массив (Random класс):");
        printArray(randomArray2);
    }

    public static double[] generateRandomArrayUsingMathRandom(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static double[] generateRandomArrayUsingRandomClass(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + "\n");
        }
        System.out.println();
    }

    public static int inputArraySize() {
        int n;
        while (true) {
            System.out.print("Введите размер массива: ");
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
}

/*
Пользователь должен ввести с клавиатуры размер массива -
натуральное число больше, так чтобы введенное пользователем число
сохранялось в переменную n. Если пользователь ввел не подходящее число, то
программа должна просить пользователя повторить ввод. Создать массив из n
случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
массив только из четных элементов первого массива, если они там есть, и
вывести его на экран
*/

package ru.mirea.lab_03.task4;

import java.util.Random;
import java.util.Scanner;

public class TesterTask4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int n = inputArraySize();
        int[] intArr = new int[n];
        int[] newIntArr;
        int cnt = 0;
        int newIndex;

        System.out.println("\nСгенерированный массив: ");
        for (int i = 0; i < n; i++){
            intArr[i] = random.nextInt(n);
            if (intArr[i] % 2 == 0){
                cnt++;
            }
            System.out.print(intArr[i] + " ");
        }

        newIndex = cnt;
        newIntArr = new int[cnt];

        for (int i = 0; i < n; i++){
            if (intArr[i] % 2 == 0){
                newIntArr[cnt - newIndex] = intArr[i];
                newIndex--;
            }
        }

        if (newIntArr.length != 0){
            System.out.println("\nОтфильтрованный массив: ");
            for (int j : newIntArr){
                System.out.print(j + " ");
            }
        } else {
            System.out.println("\nВ исходном массиве нет четных чисел");
        }
    }

    public static int inputArraySize() {
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
}

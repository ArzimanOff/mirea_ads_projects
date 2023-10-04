/*
Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода
*/


package ru.mirea.lab1;

import java.util.Scanner;

public class Task7 {
    Scanner scanner = new Scanner(System.in);

    public void runTask() {
        int num;
        int answer;
        System.out.println("Факториал какого числа найти?\nВведите число: ");
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка, введите число заново: ");
                scanner.next(); // Очистка ввода
            }
        }

        answer = factorial(num);

        if(answer >= 1){
            System.out.printf("Факториал числа %d = %d", num, answer);
        } else {
            System.out.printf("Факториал числа %d не существует, т.к. оно отрицательное!", num);
        }
    }

    public int factorial(int n) {
        int result;

        if (n == 0) {
            result = 1;
        } else if (n < 0) {
            result = -1;
        } else {
            result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }

        return result;
    }
}

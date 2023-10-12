/*
Создать класс точка Point, описывающий точку на плоскости. Создать
Circle класс, в котором одно поле представляет точку – центр окружности, и
добавить другие свойства, позволяющие задать точку на плоскости. Создать
третий класс Tester который использует для хранения объектов массив объектов
Circle и второе поле количество элементов в массиве.
*/

package ru.mirea.lab3.task2;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numCircles = inputArraySize(); // Количество окружностей
        Circle smallestCircle;
        Circle largestCircle;

        Circle[] circles = new Circle[numCircles];
        Random random = new Random();

        // Заполнение массива случайными окружностями
        for (int i = 0; i < numCircles; i++) {
            double x = getRandomRoundedNum(random, 10,3);  // Случайные координаты x (от 0 до 10)
            double y = getRandomRoundedNum(random, 10,3);   // Случайные координаты y (от 0 до 10)
            double radius = getRandomRoundedNum(random, 10,3);   // Случайный радиус (от 0 до 5)

            Point center = new Point(x, y);
            circles[i] = new Circle(center, radius);
        }

        smallestCircle = findSmallestCircle(circles);
        largestCircle = findLargestCircle(circles);

        // Вывод свойств окружностей
        for (int i = 0; i < numCircles; i++) {
            System.out.println("Окружность №" + (i + 1) + ":");
            System.out.println(circles[i].toString());
            System.out.println();
        }

        System.out.println("\nНаименьшая окружность:\n" + smallestCircle.toString());
        System.out.println("\nНаибольшая окружность:\n" + largestCircle.toString());
    }

    public static Circle findSmallestCircle(Circle[] circles) {
        Circle smallest = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].radius < smallest.radius) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public static Circle findLargestCircle(Circle[] circles) {
        Circle largest = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].radius > largest.radius) {
                largest = circles[i];
            }
        }
        return largest;
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

    public static double getRandomRoundedNum(Random random, int maxVal, int precision){
        double randomNumber = random.nextDouble(); // Генерировать случайное число между 0 и 1
        return Math.round(randomNumber * Math.pow(maxVal, precision)) / Math.pow(maxVal, precision);
    }
}
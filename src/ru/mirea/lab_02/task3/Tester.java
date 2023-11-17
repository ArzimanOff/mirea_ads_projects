/*
Создать класс точка Point, описывающий точку на плоскости. Создать
Circle класс, в котором одно поле представляет точку – центр окружности, и
добавить другие свойства, позволяющие задать точку на плоскости. Создать
третий класс Tester который использует для хранения объектов массив объектов
Circle и второе поле количество элементов в массиве.
*/

package ru.mirea.lab_02.task3;

import java.util.Scanner;

public class Tester {
    static Scanner scanner = new Scanner(System.in);
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон, нельзя добавить больше элементов.");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            double radius = circle.getRadius();
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + center.getX() + ", " + center.getY() + ")");
            System.out.println("Радиус: " + radius);
            System.out.println();
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

    public static double inputDoubleValue() {
        double n;
        while (true) {
            if (scanner.hasNextDouble()) {
                n = scanner.nextDouble();
                break;
            } else {
                System.out.println("Пожалуйста, введите число!");
                scanner.next(); // Очистка ввода
            }
        }

        return n;
    }


    public static void main(String[] args) {
        int n;
        double xPoint, yPoint;
        double radius;
        n = inputArraySize();
        Tester tester = new Tester(n);

        for (int i = 0; i < n; i++){
            System.out.println("\nОкружность №" + (i + 1) + ": ");
            System.out.print("Введите координату X: ");
            xPoint = inputDoubleValue();
            System.out.print("Введите координату Y: ");
            yPoint = inputDoubleValue();
            Point center = new Point(xPoint, yPoint);
            System.out.print("Введите радиус: ");
            radius = inputDoubleValue();
            System.out.print("\n==========================\n");
            Circle circle = new Circle(center, radius);

            tester.addCircle(circle);
        }

        System.out.println("Вывод данных окружностей, хранящихся в массиве:\n");
        tester.displayCircles();
        scanner.close();
    }
}

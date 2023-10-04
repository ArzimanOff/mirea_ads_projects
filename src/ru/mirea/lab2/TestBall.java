package ru.mirea.lab2;

import java.util.Locale;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {

        // Устанавливаем локаль с разделителем точкой
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную координату X для мяча (тип double): ");
        double initialX = 0.0;
        if (scanner.hasNextDouble()) {
            initialX = scanner.nextDouble();
        } else {
            System.out.println("Ошибка: Неверный формат числа для координаты X.");
            System.exit(1);
        }

        System.out.print("Введите начальную координату Y для мяча (тип double): ");
        double initialY = 0.0;
        if (scanner.hasNextDouble()) {
            initialY = scanner.nextDouble();
        } else {
            System.out.println("Ошибка: Неверный формат числа для координаты Y.");
            System.exit(1);
        }

        Ball ball = new Ball(initialX, initialY);

        // Выводим начальные координаты мяча
        System.out.println("Начальные координаты шара: ");
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());

        // Изменяем координаты мяча
        ball.setXY(4.0, 5.0);
        System.out.println("Обновлённые координаты шара: ");
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());

        System.out.print("На сколько изменить координату X: ");
        double xDisp = 0.0;
        if (scanner.hasNextDouble()) {
            xDisp = scanner.nextDouble();
        } else {
            System.out.println("Ошибка: Неверный формат числа.");
            System.exit(1);
        }

        System.out.print("На сколько изменить координату Y: ");
        double yDisp = 0.0;
        if (scanner.hasNextDouble()) {
            yDisp = scanner.nextDouble();
        } else {
            System.out.println("Ошибка: Неверный формат числа.");
            System.exit(1);
        }
        // Двигаем мяч
        ball.move(xDisp, yDisp);
        System.out.println("Координаты шара после движения шара: ");
        System.out.println("X: " + ball.getX());
        System.out.println("Y: " + ball.getY());

        // Выводим информацию о мяче с использованием метода toString
        System.out.println(ball.toString());
    }
}

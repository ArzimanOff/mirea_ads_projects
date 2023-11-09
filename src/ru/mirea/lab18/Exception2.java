package ru.mirea.lab18;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        exceptionDemo();
    }
    public static void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено: " + e.getMessage());
        } catch (Exception e) {
            // обработка других видов исключений
            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            scanner.close(); // Закрываем сканер, чтобы освободить ресурсы
        }
    }

}
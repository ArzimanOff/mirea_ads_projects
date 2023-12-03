package ru.mirea.lab_18;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        exceptionDemo();
    }
    public static void exceptionDemo() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            String intString = scanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(12 / i);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число типа Int : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 запрещено: " + e.getMessage());
        } catch (Exception e) {
            // обработка других видов исключений
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

}
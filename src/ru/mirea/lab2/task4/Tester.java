/*
Разработайте класс Shop для, реализуйте методы добавления и
удаления компьютеров в магазине, добавьте метод поиска в магазине
компьютера, нужного пользователю. Протестируйте работу созданных классов.
Данные для заполнения массива компьютеров вводятся с клавиатуры
пользователем. Для этого реализуйте интерфейс.
*/

package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Tester {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Shop shop = new Shop();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер по модели");
            System.out.println("4. Вывести список компьютеров");
            System.out.println("5. Выход из магазина");
            int choice = inputIntValue();
            doAction(choice, shop);
        }
    }

    public static void doAction(int choice, Shop shop){
        switch (choice) {
            case 1:
                System.out.println("Введите модель компьютера:");
                String model = scanner.next();
                Computer computer = new DesktopComputer(model);
                shop.addComputer(computer);
                System.out.println("Компьютер добавлен в магазин.");
                break;
            case 2:
                System.out.println("Введите модель компьютера, который хотите удалить:");
                String modelToRemove = scanner.next();
                Computer computerToRemove = shop.findComputerByModel(modelToRemove);
                if (computerToRemove != null) {
                    shop.removeComputer(computerToRemove);
                    System.out.println("Компьютер удален из магазина.");
                } else {
                    System.out.println("Компьютер с указанной моделью не найден в магазине.");
                }
                break;
            case 3:
                System.out.println("Введите модель компьютера, который хотите найти:");
                String modelToFind = scanner.next();
                Computer foundComputer = shop.findComputerByModel(modelToFind);
                if (foundComputer != null) {
                    System.out.println("Компьютер найден: " + foundComputer.getModel());
                } else {
                    System.out.println("Компьютер с указанной моделью не найден в магазине.");
                }
                break;
            case 4:
                shop.listComputers();
                break;
            case 5:
                System.out.println("Программа завершена.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите действие из списка.");
        }
    }
    public static int inputIntValue() {
        int n;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            } else {
                System.out.println("Пожалуйста, введите число!");
                scanner.next(); // Очистка ввода
            }
        }

        return n;
    }
}

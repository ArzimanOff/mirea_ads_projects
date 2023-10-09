package ru.mirea.lab2.task5;

import java.util.Scanner;

public class DogKennel {
    static Scanner scanner = new Scanner(System.in);
    private Dog[] dogsList;
    private int count;

    public DogKennel(int capacity) {
        dogsList = new Dog[capacity];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogsList.length) {
            dogsList[count] = dog;
            count++;
        } else {
            System.out.println("Список переполнен!");
        }
    }

    public void displayDogs() {
        for (int i = 0; i < count; i++) {
            Dog dog = dogsList[i];
            System.out.println(dog.toString());
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

    public static String inputStringValue() {
        String str;
        while (true) {
            if (scanner.hasNext()) {
                str = scanner.next();
                break;
            } else {
                System.out.println("Пожалуйста, строку!");
                scanner.next(); // Очистка ввода
            }
        }

        return str;
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

    public static void main(String[] args) {
        int n;
        int age;
        String nickname;
        n = inputArraySize();
        DogKennel dogKennel = new DogKennel(n);

        for (int i = 0; i < n; i++){
            System.out.println("\nСобака №" + (i + 1) + ": ");
            System.out.print("Введите кличку: ");
            nickname = inputStringValue();
            System.out.print("Введите возраст собаки: ");
            age = inputIntValue();
            Dog dog = new Dog(nickname, age);
            System.out.print("\n==========================\n");

            dogKennel.addDog(dog);
        }

        System.out.println("Вывод данных окружностей, хранящихся в массиве:\n");
        dogKennel.displayDogs();
    }

}

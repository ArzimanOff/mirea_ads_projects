package ru.mirea.lab18;

import java.util.Scanner;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("В getDetails передано null!");
            }
            System.out.println("Ключ = " + key);
        } catch (NullPointerException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            System.out.println("Ключ не задан.");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        System.out.println("\n1) ");
        demo.getDetails("12dc23rd3r43tre324");
        System.out.println("\n2) ");
        demo.getDetails(null);
    }
}

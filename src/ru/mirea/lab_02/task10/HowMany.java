/*
Напишите программу HowMany.java, которая определит, сколько
слов Вы ввели с консоли.
*/

package ru.mirea.lab_02.task10;

import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int cnt = countWords(text);

        System.out.println("Cлов в тексте: " + cnt);

        scanner.close();
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
}


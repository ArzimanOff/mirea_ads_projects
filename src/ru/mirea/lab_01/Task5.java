/*
Написать программу, в результате которой выводятся на экран
аргументы командной строки в цикле for.
*/

package ru.mirea.lab_01;

public class Task5 {
    public static void main(String[] args) {
        if (args != null) {
            int i = 1;
            for (String arg : args) {
                System.out.println("Аргумент " + i + ": " + arg);
                i++;
            }
        }
    }
}

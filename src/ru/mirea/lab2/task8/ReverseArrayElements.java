package ru.mirea.lab2.task8;

public class ReverseArrayElements {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};

        System.out.println("Исходный массив:");
        for (String element : strArray) {
            System.out.print(element + " ");
        }

        reverseArray(strArray);

        System.out.println("\nМассив после обмена элементов в обратном порядке:");
        for (String element : strArray) {
            System.out.print(element + " ");
        }
    }

    public static void reverseArray(String[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
}


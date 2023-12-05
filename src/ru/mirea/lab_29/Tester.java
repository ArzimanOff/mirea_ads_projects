/*
Входные данные
В первой строке задается число N (0 ≤ N ≤ 100), (число городов в стране).
В следующих N строках содержится по N чисел, каждое из которых является единичкой или ноликом.
Причем, если в позиции (i, j) квадратной матрицы стоит единичка,
то i-ый и j-ый города соединены дорогами, а если нолик, то не соединены.

Выходные данные
Одно число – количество дорог в стране
===================================
Пример входных данных:
5
0 1 0 0 0
1 0 1 1 0
0 1 0 0 0
0 1 0 0 0
0 0 0 0 0
===================================
Выходные данные:
3
===================================
*/



package ru.mirea.lab_29;

import java.util.Scanner;

public class Tester {


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите кол-во городов в стране: ");
            // Вводим количество городов
            int N = scanner.nextInt();
            // Создаем матрицу смежности
            int[][] adjacencyMatrix = new int[N][N];

            // Создаем экземпляр счетчика дорог
            RoadCounter roadCounter;

            System.out.println("Введите матрицу смежности городов: ");
            // Заполняем матрицу смежности
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    adjacencyMatrix[i][j] = scanner.nextInt();
                }
            }
            roadCounter = new RoadCounter(N, adjacencyMatrix);
            // Выводим результат
            System.out.println(roadCounter.getNumOfRoads());
        } catch (Exception e) {
            System.err.println("Ошибка ввода данных: " + e.getMessage());
        }

    }
}

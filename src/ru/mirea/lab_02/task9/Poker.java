/*
Напишите программу Poker.java, которая должна имитировать
раздачу карт для игры в покер. Программа получает число n, задаваемое с
консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из
перетасованной колоды. Разделяйте пять карт, выданных каждому игроку,
пустой строкой
*/

package ru.mirea.lab_02.task9;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfPlayers = 0;
        while (numberOfPlayers < 1 || numberOfPlayers > 10){
            System.out.println("Количество игроков должно быть от 1 до 10.");
            System.out.print("Введите количество игроков: ");
            numberOfPlayers = inputIntValue();
        }

        List<String> deck = getDeck();
        shuffleDeck(deck);

        for (int player = 1; player <= numberOfPlayers; player++) {
            List<String> playerHand = handOutCards(deck);
            System.out.println("Игрок " + player + " получает:");
            if (playerHand != null){
                for (String card : playerHand) {
                    System.out.println(card);
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    private static @NotNull List<String> getDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = { "Пики", "Черви", "Бубны", "Крести" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    private static List<String> handOutCards(List<String> deck) {
        List<String> hand = new ArrayList<>();
        if (deck != null){
            for (int i = 0; i < 5; i++) {
                hand.add(deck.remove(0));
            }
        } else {
            return null;
        }
        return hand;
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

package ru.mirea.lab2.task7;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private int booksCnt;
    private final Book[] booksList;

    public Bookshelf(int capacity) {
        booksList = new Book[capacity];
        booksCnt = 0;
    }

    public void addBook(Book book) {
        if (booksCnt < booksList.length) {
            booksList[booksCnt] = book;
            booksCnt++;
        } else {
            System.out.println("Книжная полка заполнена, невозможно добавить больше книг.");
        }
    }

    public Book getEarliestBook() {
        if (booksCnt == 0) {
            return null;
        }

        Book earliestBook = booksList[0];
        for (int i = 1; i < booksCnt; i++) {
            if (booksList[i].getYearOfWriting() < earliestBook.getYearOfWriting()) {
                earliestBook = booksList[i];
            }
        }
        return earliestBook;
    }

    public Book getLatestBook() {
        if (booksCnt == 0) {
            return null;
        }

        Book latestBook = booksList[0];
        for (int i = 1; i < booksCnt; i++) {
            if (booksList[i].getYearOfWriting() > latestBook.getYearOfWriting()) {
                latestBook = booksList[i];
            }
        }
        return latestBook;
    }

    public void sortBooksByYear() {
        Arrays.sort(booksList, 0, booksCnt, Comparator.comparingInt(Book::getYearOfWriting));
    }

    public void printBooksFromBookshelf() {
        if (booksCnt > 0){
            System.out.println("\nСейчас на полке " + formatBookCount(booksCnt) + " :");
            for (int i = 0; i < booksCnt; i++){
                System.out.println((i + 1) + ") " + booksList[i].toString());

            }
        } else {
            System.out.println("Сейчас на полке нет ни одной книги.");
        }
    }

    public static String formatBookCount(int count) {
        String result;

        if (count == 1) {
            result = count + " книга";
        } else if (count % 10 >= 2 && count % 10 <= 4 && (count % 100 < 10 || count % 100 >= 20)) {
            result = count + " книги";
        } else {
            result = count + " книг";
        }

        return result;
    }
}

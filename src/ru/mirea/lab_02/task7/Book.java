package ru.mirea.lab_02.task7;

import java.util.Random;

public class Book {
    private String title;
    private String author;
    private int yearOfWriting;
    private int cntOfPages;

    public Book(String title, String author, int yearOfWriting) {
        Random random = new Random();
        this.title = title;
        this.yearOfWriting = yearOfWriting;
        if (author != null) {
            this.author = author;
        } else {
            this.author = "Неизвестен";
        }
        this.cntOfPages = random.nextInt(1000 - 50 + 1) + 50;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public int getCntOfPages() {
        return cntOfPages;
    }

    public void setCntOfPages(int cntOfPages) {
        this.cntOfPages = cntOfPages;
    }

    @Override
    public String toString() {
        return "\"" + this.getTitle() + "\" " +
                " / автор: " + this.getAuthor() +
                " / страниц в книге: " + this.getCntOfPages() +
                " / год написания: " +
                (this.getYearOfWriting() > 0 ? this.getYearOfWriting() : (-1 * this.getYearOfWriting() + " до н.э."));
    }
}

/*
Создать класс, описывающий книгу (Book). В классе должны быть
описаны нужные свойства книги (автор, название, год написания и т. д.) и
методы для получения, изменения этих свойств. Протестировать работу класса в
классе BookTest, содержащим метод статический main(String[] args). Создать
класс книжная полка, в котором поля данных класса это массив объектов типа
книги (Book), и количество книг на книжной полке. Написать методы класса,
которые возвращают книги с самым поздним и самым ранним сроком издания.
Написать метод класса, позволяющий расставить книги на книжной полке в
порядке возрастания года выпуска.
*/

package ru.mirea.lab2.task7;

import java.util.Scanner;
import java.util.Calendar;

public class BookTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int bookCnt;
        Bookshelf bookshelf;
        System.out.print("Введите количество книг, которое хотите положить на полку: ");

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        bookCnt = inputIntValue();

        while (bookCnt < 0){
            System.out.print("Введите положительное число! : ");
            bookCnt = inputIntValue();
        }

        bookshelf = new Bookshelf(bookCnt);

        for (int i = 0; i < bookCnt; i++){
            Scanner in = new Scanner(System.in);
            String bookTitle;
            String bookAuthor;
            int bookYearOfWriting;
            Book book;

            System.out.println("\nЗаполните данные о книге №" + (i + 1) + " :");
            System.out.print("Название: ");
            bookTitle = in.nextLine();
            System.out.print("Автор: ");
            bookAuthor = in.nextLine();
            System.out.print("Год публикации: ");
            bookYearOfWriting = inputIntValue();

            while (bookYearOfWriting > currentYear){
                System.out.print("Год выпуска не может быть больше текущего!\nВведите год заново: ");
                bookYearOfWriting = inputIntValue();
            }

            book = new Book(bookTitle, bookAuthor, bookYearOfWriting);

            bookshelf.addBook(book);
        }

        bookshelf.printBooksFromBookshelf();

        System.out.println("\nСамая новая книга на полке:");
        System.out.println(bookshelf.getLatestBook());
        System.out.println("\nСамая старая книга на полке:");
        System.out.println(bookshelf.getEarliestBook());

        bookshelf.sortBooksByYear();
        System.out.print("\nКниги на полке после сортировки по дате выпуска:");
        bookshelf.printBooksFromBookshelf();
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

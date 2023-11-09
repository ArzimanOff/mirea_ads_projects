/*
По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author и TestAuthor.
Класс Author должен содержать поля:
-name:String
-email: String
-gender: char

и реализацию методов:
+Author(name:String, email: String, gender: char)
+getName():String
+getEmail():String
+setEmail(email:String): void
+getGender():char
+toString(): String
*/

package ru.mirea.lab_02.task1;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "old@example.com", 'M');

        System.out.println("Автор:");
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("new_email@example.com");
        System.out.println("\nНовый email: " + author.getEmail());

        System.out.println(author.toString());
    }
}

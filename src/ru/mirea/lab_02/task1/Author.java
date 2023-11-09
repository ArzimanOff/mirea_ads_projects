package ru.mirea.lab_02.task1;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nАвтор:\n" +
                "Имя: " + this.name +
                "\nEmail: " + this.email +
                "\nПол: " + this.gender;
    }



}
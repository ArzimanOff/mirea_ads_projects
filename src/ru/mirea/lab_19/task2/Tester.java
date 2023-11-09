package ru.mirea.lab_19.task2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> studentsTable = new ArrayList<>();
        studentsTable.add(new Student("А", 1, 5, 18));
        studentsTable.add(new Student("Б", 2, 6, 18));
        studentsTable.add(new Student("В", 3, 7, 19));
        studentsTable.add(new Student("Г", 4, 8, 20));
        studentsTable.add(new Student("Д", 5, 9, 20));

        new LabClassUI(studentsTable);
    }

}

package ru.mirea.lab_19.task2;

import java.util.Comparator;

public class AvgComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getAvgPoint() - student2.getAvgPoint();
    }
}
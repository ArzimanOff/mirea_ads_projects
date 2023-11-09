package ru.mirea.lab_19.task2;

import java.util.Comparator;

public class GroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getGroupNum() - student2.getGroupNum();
    }
}
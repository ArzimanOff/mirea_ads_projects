package ru.mirea.lab_23.task2;



public abstract class AbstractQueue implements Queue {
    protected int head, tail;
    protected static final int START_CAPACITY = 16;
}
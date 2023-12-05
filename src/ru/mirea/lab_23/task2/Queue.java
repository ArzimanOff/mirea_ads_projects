package ru.mirea.lab_23.task2;

public interface Queue {
    Object dequeue(); // удалить и вернуть первый элемент в очереди
    Object element(); //  первый элемент в очереди
    void enqueue(Object o); // добавить элемент в очередь
    boolean isEmpty(); // является ли очередь пустой
    boolean clear(); // удалить все элементы из очереди
    int size(); // текущий размер очереди
}
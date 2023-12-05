package ru.mirea.lab_23.task2;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {

    private final LinkedList<Object> linkedQueue;

    public LinkedQueue(){
        linkedQueue = new LinkedList<>();
        head = tail = 0;
    }

    @Override
    public Object dequeue() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return  linkedQueue.remove(head);
    }

    @Override
    public Object element() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return  linkedQueue.get(head);     }

    @Override
    public void enqueue(Object o) {
        linkedQueue.add(o);
        tail++;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    @Override
    public boolean clear() {
        boolean r = ! isEmpty();
        linkedQueue.clear();
        head = tail = 0;
        return r;
    }

    @Override
    public int size() {
        return linkedQueue.size();
    }
}
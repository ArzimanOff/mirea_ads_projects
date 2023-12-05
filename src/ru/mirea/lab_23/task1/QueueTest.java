package ru.mirea.lab_23.task1;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        System.out.println(aqm.element());
        System.out.println(aqm.size());
        System.out.println(aqm.isEmpty());
        aqm.clear();
        System.out.println(aqm.isEmpty());
        aqm.enqueue("Text4");
        aqm.enqueue("Text5");
        System.out.println(aqm.size());
        System.out.println(aqm.dequeue());
        System.out.println(aqm.size());
    }
}
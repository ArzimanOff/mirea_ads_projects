package ru.mirea.lab2.task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 3.4, 4);
        Circle circle2= new Circle(5, 0, 3.8);
        Circle circle3= new Circle(8, 2, 3.8);
        circle1.compareCircles(circle2);
        circle2.compareCircles(circle3);
    }
}

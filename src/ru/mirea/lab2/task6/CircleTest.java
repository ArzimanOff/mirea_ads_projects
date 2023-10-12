/*
Создать класс, описывающий модель окружности (Circle). В классе
должны быть описаны нужные свойства окружности и методы для получения и
изменения этих свойств. Добавить методы для расчета площади круга и длины
окружности, а также метод позволяющий сравнивать две окружности. При
помощи класса CircleTest, содержащего статический метод main(String[] args),
протестировать работу класса Circle.
*/

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

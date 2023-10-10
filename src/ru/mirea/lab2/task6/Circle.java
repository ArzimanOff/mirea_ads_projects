package ru.mirea.lab2.task6;

public class Circle {
    private double centerX, centerY;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
    }

    public double[] getCenter() {
        return new double[]{this.centerX, this.centerY};
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        double area;
        area = Math.PI * Math.pow(getRadius(), 2);
        return Math.round(area * 1000.0) / 1000.0;
    }

    public double findCircleLength(){
        double length;
        length = Math.PI * (getRadius() * 2);
        return Math.round(length * 1000.0) / 1000.0;
    }

    public void compareCircles (Circle circle){
        int numOfBiggest;
        System.out.println("Сравнение окружностей:");
        System.out.print("1) ");
        System.out.println(this.toString());
        System.out.print("2) ");
        System.out.print(circle.toString());

        if (this.getRadius() > circle.getRadius()){
            numOfBiggest = 1;
        } else if (this.getRadius() < circle.getRadius()) {
            numOfBiggest = 2;
        } else {
            numOfBiggest = 0;
        }

        if (numOfBiggest != 0){
            System.out.println("\nВывод: окружность №" + numOfBiggest + " больше.\n");
        } else {
            System.out.println("\nВывод: окружности равны.\n");
        }
    }

    @Override
    public String toString() {
        return "Окружность {" +
                "координаты центра = (" + this.getCenter()[0] + ", " + this.getCenter()[1] + ")" +
                ", радиус = " + this.getRadius() +
                ", площадь = " + this.findArea() +
                ", длина окружности = " + this.findCircleLength() +
                '}';
    }
}
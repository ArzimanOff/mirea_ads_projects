package ru.mirea.lab3.task2;

class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Центр: (" + this.center.x + ", " + this.center.y + ")" +
                "\nРадиус: " + this.radius +
                "\nПлощадь: " + this.getArea() +
                "\nДлина окружности: " + this.getCircumference();
    }
}

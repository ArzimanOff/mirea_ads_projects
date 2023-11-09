package ru.mirea.lab_20;

public class ThreeTypesGenericTester {
    public static void main(String[] args) {
        ThreeGeneric<String, Dog, Integer> dog = new ThreeGeneric<>("Шарик", new Dog(), 10);
        dog.showTypes();
    }
}

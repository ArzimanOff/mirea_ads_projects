package ru.mirea.lab_18;

public class Exception1 {
    public static void main(String[] args) {
        exceptionDemo();
    }
    static public void exceptionDemo() {
        try {
            System.out.println( 2 / 0 );
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль запрещено");
        }
    }
}
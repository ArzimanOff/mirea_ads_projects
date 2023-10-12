/*
Задание 1
1. Создайте объекты класса Double, используя методы valueOf().
2. Преобразовать значение типа String к типу double. Используем
метод Double.parseDouble().
3. Преобразовать объект класса Double ко всем примитивным типам.
4. Вывести значение объекта Double на консоль.
5. Преобразовать литерал типа double к строке: String d =
Double.toString(3.14);
 */

package ru.mirea.lab3.taskextra1;

public class ExtraTask1 {
    public static void main(String[] args) {
        // Задание 1: Создание объектов класса Double с использованием метода valueOf()
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.718");

        // Задание 2: Преобразование строки в тип double с использованием метода Double.parseDouble()
        String strValue = "1.234";
        double parsedDouble = Double.parseDouble(strValue);

        // Задание 3: Преобразование объекта Double в примитивные типы
        double doubleValue = doubleObject1.doubleValue();
        float floatValue = doubleObject1.floatValue();
        long longValue = doubleObject1.longValue();
        int intValue = doubleObject1.intValue();
        short shortValue = doubleObject1.shortValue();
        byte byteValue = doubleObject1.byteValue();

        // Задание 4: Вывод значения объекта Double на консоль
        System.out.println("Значение объекта doubleObject1: " + doubleObject1);

        // Задание 5: Преобразование литерала double в строку
        String d = Double.toString(3.14);

        // Вывод результата
        System.out.println("Преобразование строки в double: " + parsedDouble);
        System.out.println("Преобразование Double в примитивные типы:");
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("floatValue: " + floatValue);
        System.out.println("longValue: " + longValue);
        System.out.println("intValue: " + intValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("byteValue: " + byteValue);
        System.out.println("Значение объекта doubleObject2: " + doubleObject2);
        System.out.println("Преобразование литерала double в строку: " + d);
    }
}

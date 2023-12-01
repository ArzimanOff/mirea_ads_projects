package ru.mirea.lab_19.task1;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InnNumTester {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите номер ИНН: ");
                try {
                    BigInteger innNum = new BigInteger(scanner.nextLine().trim());
                    checkInn(innNum);
                    System.out.println("Верный ИНН!");
                    break;
                } catch (InnNotValidException e) {
                    System.out.println(e.getLocalizedMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода ИНН номера: " + e.getMessage() + " -> присутствуют символы помимо цифр");
                    // Очистите буфер после ошибочного ввода
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
                }
            }
        }
    }

    public static void checkInn(@NotNull BigInteger innNum) throws InnNotValidException{
        int i = 0;
        BigInteger tempInnNum = new BigInteger(innNum.toByteArray());
        while (!tempInnNum.equals(new BigInteger("0"))){
            i++;
            tempInnNum = new BigInteger(tempInnNum.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new InnNotValidException(innNum);
    }
}
package ru.mirea.lab2.task4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера в магазине по модели
    public Computer findComputerByModel(String model) {
        for (Computer computer : computers) {
            if (computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null;
    }

    // Метод для вывода всех компьютеров в магазине
    public void listComputers() {
        System.out.println("Компьютеры в магазине:");
        if(!computers.isEmpty()){
            for (Computer computer : computers) {
                System.out.println(computer.getModel());
            }
        } else {
            System.out.println("В магазине пока нет компьютеров.");
        }

    }
}






package ru.mirea.lab2.task5;

public class Dog {
    String nickname;
    int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public int getIntoHumanAge(){
        int resultAge;
        resultAge = this.age * 7;
        return resultAge;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Описание собаки: " +
                "кличка = '" + this.getNickname() + '\'' +
                ", возраст = " + formatAge(this.getAge()) +
                " (" + this.getIntoHumanAge() +
                " в человеческих годах)";
    }

    public static String formatAge(int age) {
        if (age >= 11 && age <= 20) {
            return age + " лет";
        } else {
            int lastDigit = age % 10;
            return switch (lastDigit) {
                case 1 -> age + " год";
                case 2, 3, 4 -> age + " года";
                default -> age + " лет";
            };
        }
    }
}

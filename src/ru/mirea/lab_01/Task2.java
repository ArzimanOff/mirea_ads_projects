/*
Текст задания:
Создать свой собственный Git репозиторий
*/

package ru.mirea.lab_01;

import java.util.Scanner;

public class Task2  extends AbstractTask {

    Task2(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void run() {
        System.out.println("Git репозиторий создан!\nСсылка: https://github.com/ArzimanOff/mirea_ads_projects");
    }
}

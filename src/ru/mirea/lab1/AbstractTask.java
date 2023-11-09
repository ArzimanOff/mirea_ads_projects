package ru.mirea.lab1;

import java.io.Closeable;
import java.util.Scanner;

abstract class AbstractTask implements Closeable, Runnable {
    protected final Scanner scanner;
    AbstractTask(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public void close() {
        scanner.close();
    }
}

package ru.mirea.lab2.task4;

class DesktopComputer implements Computer {
    private String model;

    public DesktopComputer(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}

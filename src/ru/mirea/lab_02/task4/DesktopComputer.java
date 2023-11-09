package ru.mirea.lab_02.task4;

class DesktopComputer implements Computer {
    private final String model;

    public DesktopComputer(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}

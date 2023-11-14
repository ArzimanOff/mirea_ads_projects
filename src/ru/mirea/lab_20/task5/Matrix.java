package ru.mirea.lab_20.task5;


public class Matrix<T extends Number> {
    private T[][] data;
    private int row;
    private int col;

    public Matrix(int rows, int cols) {
        this.row = rows;
        this.col = cols;
        this.data = (T[][]) new Number[rows][cols];
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    public void checkMatrixBounds(Matrix<T> other){
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Для операций сложения и вычитания, матрицы должны быть одинаковых размеров");
        }
    }
    public Matrix<T> minus(Matrix<T> other) {
        checkMatrixBounds(other);

        Matrix<T> result = new Matrix<>(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                double thisVal = data[i][j].doubleValue();
                double otherVal = other.data[i][j].doubleValue();
                result.data[i][j] = (T) Double.valueOf(thisVal - otherVal);
            }
        }
        return result;
    }

    public Matrix<T> add(Matrix<T> other) {
        checkMatrixBounds(other);

        Matrix<T> result = new Matrix<>(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                double thisVal = data[i][j].doubleValue();
                double otherVal = other.data[i][j].doubleValue();
                result.data[i][j] = (T) Double.valueOf(thisVal + otherVal);
            }
        }
        return result;
    }
}
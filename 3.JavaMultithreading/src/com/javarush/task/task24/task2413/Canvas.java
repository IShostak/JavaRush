package com.javarush.task.task24.task2413;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    void setPoint(double x, double y, char c) {

    }

    void drawMatrix(double x, double y, int[][] matrix, char c) {

    }


    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height+2][width+2];
//
//        for (int i = 0; i < height + 2; i++) {
//            for (int j = 0; j < width + 2; i++) {
//                matrix[i][j] = 0;
//            }
//        }

    }
}

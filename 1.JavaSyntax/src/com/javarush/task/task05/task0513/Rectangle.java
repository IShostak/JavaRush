package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int  top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.top  = top;
        this.height = height;
        this.left = left;
        this.width = width;
    }
    public void initialize( int width, int height){
        this.top  = 0;
        this.height = height;
        this.left = 0;
        this.width = width;
    }
    public void initialize(int top, int left, int height){
        this.top  = top;
        this.height = height;
        this.left = left;
        this.width = height;
    }
    public  void initialize(Rectangle rectangle){
        this.width = rectangle.width;
        this.height= rectangle.height;
        this.left = rectangle.left;
        this.top     = rectangle.top;
    }

    public static void main(String[] args) {

    }
}

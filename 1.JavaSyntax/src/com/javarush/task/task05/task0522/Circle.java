package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(){
        this.x =0;
        this.y =0;
        this.radius =0;
    }
    public Circle(int x){
        this.x  = x;
    }
    public Circle(int x, int y){
        this(x);
        this.y = y;
    }
    public Circle(int x, int y, int radius){
        this(x,y);
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}
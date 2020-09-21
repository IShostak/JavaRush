package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name;
    String color;
    int height;
    public void  initialize(String name){
        this.name = name;
        this.height = 15;
        this.color = "grey";
    }
    public void  initialize(String name, int height){
        this.name = name;
        this.height = height;
        this.color ="grey";
    }
    public void  initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}

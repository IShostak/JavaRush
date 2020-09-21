package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, color, address;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.address = null;
        this.age = 3;
        this.weight= 5;
        this.color = "grey";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.address = null;
        this.age = age;
        this.weight= weight;
        this.color = "grey";
    }
    public Cat(String name,  int age){
        this.name = name;
        this.address = null;
        this.age = age;
        this.weight= 3;
        this.color = "grey";
    }
    public Cat(int weight, String color){
        this.name = null;
        this.address = null;
        this.age = 3;
        this.weight= weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.name = null;
        this.address = address;
        this.age = 3;
        this.weight= weight;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}

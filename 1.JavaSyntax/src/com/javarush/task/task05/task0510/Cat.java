package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    String address;
    int age = 3;
    String color;
    int weight =1;
    public void initialize(String name){
        this.name = name;
        this.age =3;
        this.weight = 3;
        this.color = "grey";

    }
    public void initialize(String name, int weight, int age){
        this.weight=weight;
        this.age= age;
        this.name = name;
        this.address = null;
        this.color = "grey";
    }
    public void initialize(String name, int age){
        this.age= age;
        this.name = name;
    }
    public void initialize(int weight,String color){
        this.weight = weight;
        this.color = color;
        this.name=  null;
        this.address = null;
    }
    public void initialize(int weight,String color, String address){
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}

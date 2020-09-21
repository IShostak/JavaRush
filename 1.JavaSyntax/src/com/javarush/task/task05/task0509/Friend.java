package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
     String name;
     int age;
     char sex;
    public void initialize(String name){

        this.name = name;

    }
    public void initialize(String name, int age){
        this.age = age;
        this.name = name;

    }
     public void initialize(String name, int age, char sex){
         this.age = age;
         this.name = name;
         this.sex =sex;
     }

    public static void main(String[] args) {

    }
}

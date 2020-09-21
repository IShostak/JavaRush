package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Pet){
            System.out.println(((Pet) o).printName());
        }
    }

     static abstract class Pet{
        abstract String printName();

    }

    public static class Cat extends Pet {
        @Override
      public String printName() {
            return "Кошка";
        }
    }

    public static class Dog extends Pet{
        @Override
       public String printName() {
            return "Собака";
        }
    }

    public static class Bird extends Pet{
        @Override
        public String printName() {
            return "Птица";
        }
    }

    public static class Lamp  extends Pet{
        @Override
        public String printName() {
            return "Лампа";
        }
    }
}

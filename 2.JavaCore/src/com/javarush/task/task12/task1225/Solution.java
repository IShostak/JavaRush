package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String res ="";
        if (o instanceof Animal) res = ((Animal) o).getName();
        else  res = "Животное";

        return res;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
        @Override
        public String getName() {
            return "Кот";
        }
    }

    public static class Tiger extends Cat {
        @Override
        public String getName() {
            return "Тигр";
        }
    }

    public static class Lion extends Cat {
        @Override
        public String getName() {
            return "Лев";
        }
    }

    public static class Bull extends Animal {
        @Override
        public String getName() {
            return "Бык";
        }
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Корова";
        }
    }

    public static class Animal {
        public  String getName(){
            return "Животное";
        }
    }
}

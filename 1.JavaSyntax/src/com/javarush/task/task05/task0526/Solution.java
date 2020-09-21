package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("1", 2, "3");
        Man man2 = new Man("1", 2, "3");
        Woman womanman = new Woman("1", 2, "3");
        Woman womanman2 = new Woman("1", 2, "3");
        System.out.println(man);
        System.out.println(man2);
        System.out.println(womanman);
        System.out.println(womanman2);

    }

    public static class Man{
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return name +" "+ age + " " + address;

        }
    }
    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, int age , String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
        @Override
        public String toString() {
            return name +" "+ age + " " + address;

        }
    }
}

package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        public Human(int age, char sex, long live) {
            this.age = age;
            this.sex = sex;
            this.live = live;
        }

        public Human(String name, Human parent, char sex, boolean dead, long live) {
            this.name = name;
            this.parent = parent;
            this.sex = sex;
            this.dead = dead;
            this.live = live;
        }

        public Human(Human parent, char sex, boolean dead) {
            this.parent = parent;
            this.sex = sex;
            this.dead = dead;
        }

        public Human(char sex, boolean dead, long live) {
            this.sex = sex;
            this.dead = dead;
            this.live = live;
        }

        public Human(int age, String name, Human parent, char sex, boolean dead, long live) {
            this.age = age;
            this.name = name;
            this.parent = parent;
            this.sex = sex;
            this.dead = dead;
            this.live = live;
        }

        public Human(int age, String name, Human parent, char sex, boolean dead) {
            this.age = age;
            this.name = name;
            this.parent = parent;
            this.sex = sex;
            this.dead = dead;
        }

        public Human(int age, String name, Human parent, char sex) {
            this.age = age;
            this.name = name;
            this.parent = parent;
            this.sex = sex;
        }

        public Human(int age, String name, Human parent) {
            this.age = age;
            this.name = name;
            this.parent = parent;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }


        private int age;
        private String name;
        private Human parent;
        private char sex;
        private boolean dead;
        private long live;

    }
}

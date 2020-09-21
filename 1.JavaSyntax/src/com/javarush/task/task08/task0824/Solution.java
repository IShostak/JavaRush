package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human ch1 = new Human(); ch1.age = 1; ch1.name = ""; ch1.sex = true;
        Human ch2 = new Human(); ch2.age = 1; ch2.name = ""; ch2.sex = true;
        Human ch3 = new Human(); ch3.age = 1; ch3.name = ""; ch3.sex = false;
        Human mt = new Human(); mt.age = 1; mt.name = ""; mt.sex = false;
        mt.children = new ArrayList<>();
        ch1.children = new ArrayList<>();
        ch2.children = new ArrayList<>();
        ch3.children = new ArrayList<>();
        mt.children.add(ch1);
        mt.children.add(ch2);
        mt.children.add(ch3);
        Human ft = new Human(); ft.age = 1; ft.name = ""; ft.sex = true;
        ft.children = new ArrayList<>();
        ft.children.add(ch1);
        ft.children.add(ch2);
        ft.children.add(ch3);
        Human gf1 = new Human(); gf1.age = 1; gf1.name = ""; gf1.sex = true;
        gf1.children = new ArrayList<>();
        gf1.children.add(mt);
        Human gm1 = new Human(); gm1.age = 1; gm1.name = ""; gm1.sex = false;
        gm1.children = new ArrayList<>();
        gm1.children.add(mt);
        Human gf2 = new Human(); gf2.age = 1; gf2.name = ""; gf2.sex = true;
        gf2.children = new ArrayList<>();
        gf2.children.add(ft);
        Human gm2 = new Human(); gm2.age = 1; gm2.name = ""; gm2.sex = false;
        gm2.children = new ArrayList<>();
        gm2.children.add(ft);
        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(ft.toString());
        System.out.println(mt.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());


    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

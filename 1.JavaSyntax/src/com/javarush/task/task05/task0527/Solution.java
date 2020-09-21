package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

       Dog dog = new Dog(1,2,3);
       Cat cat = new Cat(3,2,1);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

     public static class Dog{
        int a,b,c;

         public Dog(int a, int b, int c) {
             this.a = a;
             this.b = b;
             this.c = c;
         }
     }
    public static class Cat{
        int a,b,c;

        public Cat(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}

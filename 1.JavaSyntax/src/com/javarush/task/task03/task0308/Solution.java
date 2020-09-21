package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int res = 1;
        for(int i =0; i< 10; i++){
            res = res*(i+1);
        }
        System.out.println(res);
    }
}

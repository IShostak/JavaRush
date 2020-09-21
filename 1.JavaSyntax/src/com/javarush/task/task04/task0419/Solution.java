package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int max = a;

        if(b>=max){
            max =b;
        }
        if(c>=max){
            max =c;
        }
        if(d>=max){
            max =d;
        }

        System.out.println(max);


    }
}

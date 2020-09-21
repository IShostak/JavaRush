package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        if(a>0 && a < 1000){
            if(a%2 ==0) System.out.print("четное ");
            else System.out.print("нечетное ");
            if(a < 10) System.out.print("однозначное число");
            else if(a >=10 && a < 100){
                System.out.print("двузначное число");
            }
            else System.out.print("трехзначное число");
        }
    }
}

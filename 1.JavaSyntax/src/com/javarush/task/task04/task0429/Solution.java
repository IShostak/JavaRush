package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int count = 0;
        int countmin = 0;

        if(a>0 ){
            count++;
        }
        else if(a <0) countmin++;
        if(b>0){
            count++;
        } else if(b <0) countmin++;
        if(c>0){
            count++;
        } else if(c <0) countmin++;
        System.out.println("количество отрицательных чисел: " + countmin);
        System.out.println("количество положительных чисел: " + count);
    }
}

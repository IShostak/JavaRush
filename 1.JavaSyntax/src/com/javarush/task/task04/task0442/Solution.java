package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        while(a != -1){
            a = scanner.nextInt();
            sum= sum + a;
        }
        scanner.close();
        System.out.println(sum);

    }
}

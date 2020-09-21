package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] ma1 = new int[20];
        int[] ma2 = new int[10];
        int[] ma3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 20;i++){
            ma1[i] = scanner.nextInt();
            if(i < 10){
                ma2[i] = ma1[i];
            }
            if(i >=10){
                ma3[i-10] = ma1[i];
                System.out.println(ma3[i-10]);
            }
        }
        scanner.close();
    }
}

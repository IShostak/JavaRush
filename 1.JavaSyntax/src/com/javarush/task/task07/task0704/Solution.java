package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] in = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <10; i++){
            in[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i  = in.length-1; i >=0;i--){
            System.out.println(in[i]);
        }
    }
}


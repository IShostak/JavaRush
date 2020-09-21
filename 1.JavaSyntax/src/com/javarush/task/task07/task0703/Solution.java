package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        int[] listt = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<10;i++){
            list[i] = scanner.nextLine();
            listt[i] = list[i].length();
            System.out.println(listt[i]);
        }
    }
}

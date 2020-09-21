package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));

        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }



    public static int getMetreFromCentimetre(int centimetre) {
       return  (centimetre-centimetre%100)/100;
    }
}
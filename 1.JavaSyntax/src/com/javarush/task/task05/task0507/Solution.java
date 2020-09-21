package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int s =  scanner.nextInt();
        int counter = 0;
        int sum = 0;
        while(s  != -1){


            sum += s;
            counter++;
            s = scanner.nextInt();
        }
        scanner.close();
        System.out.println((sum*1.0)/counter);
    }
}


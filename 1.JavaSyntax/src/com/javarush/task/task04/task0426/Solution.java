package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        if(num < 0){
            System.out.print("отрицательное ");
        }
        else if(num > 0){
            System.out.print("положительное ");
        }
        else System.out.println("ноль");

        if(num % 2 ==0 && num !=0){
            System.out.print("четное число");
        }
        else if (num % 2 !=0)System.out.println("нечетное число");
        else if(num ==0){
            return;
        }


    }
}

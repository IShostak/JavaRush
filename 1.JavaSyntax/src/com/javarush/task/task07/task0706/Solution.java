package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] gou = new int[15];
        int evensum = 0;
        int oddsum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 15;i++){
            gou[i] = sc.nextInt();
            if(i %2 ==0){
                evensum +=gou[i];
            }
            else oddsum += gou[i];
        }
        if(evensum > oddsum) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}

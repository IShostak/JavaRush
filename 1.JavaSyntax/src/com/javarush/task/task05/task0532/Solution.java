package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = -2147483648;
        if(n >0){
            int temp =0;
            while(n >0){
                temp = Integer.parseInt(reader.readLine());

                if (temp > maximum){
                    maximum = temp;
                }
                n--;
            }
        }

        reader.close();

        System.out.println(maximum);
    }
}

package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "S";
        int a = 1;
        int b = 1;
        while(a <11){
            {
                while (b <11){
                    System.out.print(s);
                 b++;
                }

            }
            System.out.println();
            a++;
            b =1;
        }

    }
}

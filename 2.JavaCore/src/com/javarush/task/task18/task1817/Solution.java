package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[0]);
        double spaceCount =0;
        double othersCount = 0;
        int data;
        while ((data=fis.read()) != -1){
            if(data == 32) {spaceCount++;
            othersCount++;}
            else othersCount++;
        }

        double d = spaceCount/othersCount*100;;
    /*    System.out.println(spaceCount);
        System.out.println(othersCount);*/
        System.out.printf("%.2f",d);
        fis.close();
    }
}

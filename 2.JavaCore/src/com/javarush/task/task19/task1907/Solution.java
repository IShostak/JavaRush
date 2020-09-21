package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws  Exception {
        BufferedReader readr = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(readr.readLine());
        readr.close();
        BufferedReader  reader1 = new BufferedReader(reader );
        int count = 0;
        while (reader1.ready()){
            String[] temp = reader1.readLine().split("\\W");
            for (String s:  temp) {
                if(s.equals("world")){
                    count++;
                }
            }
        }
        reader.close();
        reader1.close();
        System.out.println(count);

    }
}

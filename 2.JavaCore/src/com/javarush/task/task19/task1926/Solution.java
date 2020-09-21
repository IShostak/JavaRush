package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        while (reader.ready()) {
            String line = reader.readLine();
            String res = "";
            for(int i = line.length() -1 ; i >-1; i--) {
                res+= line.toCharArray()[i];
            }
            System.out.println(res);
        }
        reader.close();
    }
}

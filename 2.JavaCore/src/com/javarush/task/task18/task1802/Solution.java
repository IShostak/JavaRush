package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fio = new FileInputStream(reader.readLine());
        reader.close();
        int min = fio.read();
        while (fio.available() > 0)
        {
            int data = fio.read();
            if (data < min)
                min = data;
        }
        fio.close();
        System.out.println(min);
    }
}

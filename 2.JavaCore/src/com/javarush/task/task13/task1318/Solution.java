package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;
        try {
             inputStream = new FileInputStream(reader.readLine());
            reader.close();
            while (inputStream.available() >0){
                System.out.print((char)inputStream.read());
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
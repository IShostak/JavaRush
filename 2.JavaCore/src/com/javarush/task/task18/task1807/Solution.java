package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();
        FileInputStream fio = new FileInputStream(file);
        int count =0;
        while (fio.available()>0){
            int data = fio.read();
            if (data == 44) count++;
        }
        fio.close();
        System.out.println(count);
    }
}

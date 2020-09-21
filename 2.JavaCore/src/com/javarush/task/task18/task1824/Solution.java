package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        boolean isExist = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (isExist){
            String file = null;
            try {
                file =reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
              FileInputStream fis =   new FileInputStream(file);
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                System.out.println(file);
                isExist = false;

            }
        }
    }
}

package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 5;
        if(args[0].equals("-e")){
            FileInputStream fis = new FileInputStream(args[1]);

            FileOutputStream fos = new FileOutputStream(args[2]);
            while (fis.available() > 0){
                int data = fis.read();
                data = data +i;
                fos.write(data);
            }
            fis.close();
            fos.close();
        }
        if(args[0].equals("-d")){
            FileInputStream fis = new FileInputStream(args[1]);

            FileOutputStream fos = new FileOutputStream(args[2]);
            while (fis.available() > 0){
                int data = fis.read();
                data = data -i;
                fos.write(data);
            }
            fis.close();
            fos.close();
        }
    }

}

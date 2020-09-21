package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 =  reader.readLine();
        String f2 =  reader.readLine();
        String f3 =  reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(f2);
        FileOutputStream fos = new FileOutputStream(f1);
        FileOutputStream fos2 = new FileOutputStream(f1, true);
        FileInputStream fis2  = new FileInputStream(f3);
        while (fis.available() >0){
            int data = fis.read();
            fos.write(data);
        }
        while (fis2.available() >0){
            int data = fis2.read();
            fos2.write(data);
        }
        fis.close();
        fis2.close();
        fos.close();
        fos2.close();

    }
}

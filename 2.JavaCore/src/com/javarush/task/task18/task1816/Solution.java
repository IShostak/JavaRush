package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws  Exception {
        FileInputStream fis = new FileInputStream(args[0]);
        int count = 0;
        while (fis.available() >0 ){
            int data = fis.read();
            if(data > 64 && data < 91 || data >96 && data < 123){
                count++;
            }
        }
        fis.close();
        System.out.println(count);
    }
}

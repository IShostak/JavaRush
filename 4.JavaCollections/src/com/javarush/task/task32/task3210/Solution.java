package com.javarush.task.task32.task3210;

/* 
Используем RandomAccessFile
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        Long number = Long.valueOf(args[1]);
        String text = args[2];
        boolean isRight = false;
        RandomAccessFile file = null;
        byte[] buffer = new byte[text.length()];


        try {
            file = new RandomAccessFile(fileName, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        file.seek(number);

        file.read(buffer,0,text.length());
        isRight = text.equals(new String(buffer));

        file.seek(file.length());
        file.write((isRight ? "true" : "false").getBytes());

        file.close();
    }
}

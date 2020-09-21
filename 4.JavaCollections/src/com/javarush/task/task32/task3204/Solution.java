package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        String password = "P0s";

        for ( int i = 0; i < 3; i++ ) {
            password += (char)(Math.random()*25+65);
        }
        for ( int i = 0; i < 3; i++ ) {
            password += (int)(Math.random()*100);
        }
        password = password.substring(0,8);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            byteArrayOutputStream.write(password.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream;
    }
}
package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        String res = "";
        String[] ss = s.trim().split("\\s+");

        for (String k:ss) {
            res+=Character.toUpperCase(k.charAt(0));
            res+=k.substring(1,k.length());
            res+=" ";
        }




        System.out.println(res);
    }
}

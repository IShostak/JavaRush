package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        String url = scanner.nextLine();
        scanner.close();

        String part = url.split("\\?")[1];

        String[]  parts = part.split("&");
        String res ="";
        ArrayList<String> list = new ArrayList<>();
        for (String s : parts) {
            String temp = s.split("=")[0];
            res +=  temp +" ";
            if(temp.equals("obj")){

                list.add(s.split("=")[1]);
            }
        }
        System.out.println(res.substring(0,res.length()-1));
        for (String s: list) {

            try {
                double d = Double.parseDouble(s);
                alert(d);
            } catch (NumberFormatException e) {
               alert(s);
            }


        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

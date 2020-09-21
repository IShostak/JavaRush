package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text;
        int i=0;
        label1:
        while (true){

            text = reader.readLine();
            if(text.equals("exit")){break;}

            try {
                i = Integer.parseInt(text);
                 if(i >0 && i< 128){
                    print((short)i);
                    continue label1;
                }
                else if (i <=0 || i >=128){
                    print((Integer) i);
                     continue label1;
                }
            } catch (NumberFormatException e) {

            }

            if (text.contains(".")){
                try {
                    print(Double.parseDouble(text));

                } catch (NumberFormatException e) {
                    print((String) text);

                }
            }

            else print(text);
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

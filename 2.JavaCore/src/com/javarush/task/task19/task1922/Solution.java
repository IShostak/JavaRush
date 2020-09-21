package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
//        words.add("А");
//        words.add("Б");
//        words.add("В");
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String file = reader1.readLine();
        reader1.close();
        int counter;
        BufferedReader reader = new BufferedReader(new FileReader(file));

        while (reader.ready()) {
            counter = 0;
            String line = reader.readLine();
            for (String s : words){
                for(String d :  line.split(" "))
                if(s.equals(d)) counter++;
                if(counter > 2) break;
            }
            if (counter == 2) System.out.println(line);
        }
        reader.close();
    }
}

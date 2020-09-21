package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int id = 0;
            int tempp = 0;
            String name = "";
        HashMap<Integer, String> map = new HashMap<>();
        while (true) {
             String temp = reader.readLine();
            if (temp.isEmpty()) break;
            id = Integer.parseInt(temp);
            temp = reader.readLine();
            name = temp;
            map.put(tempp, id + " "+ name);
            if (temp.isEmpty()) break;


            tempp++;
        }



        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}

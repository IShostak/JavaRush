package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(""+i+"ban", "ban"+i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
         int counter = 0;
         for (Map.Entry<String, String> entry: map.entrySet()){
             if(entry.getValue().equals(name)){
                 counter++;
             }
         }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int counter = 0;
        for (Map.Entry<String, String> entry: map.entrySet()){
            if(entry.getKey().equals(lastName)){
                counter++;
            }
        }
        return counter;

    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> s = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            s.put(i+" ", i*2+" ");
        }
        return s;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String,String> copy = new HashMap<String,String>(map);


        for (Map.Entry<String,String> pair:copy.entrySet()) {
            String value = pair.getValue();  //Переменная, которая приобретает каждое значение из HashMap.
            int k = 0;
            for (Map.Entry<String, String> tPair : copy.entrySet()) {
                if (value == tPair.getValue()) k++; //Сравниваем ее с другими значениями, и если эквивалентны -- прибавляем счетчик.
            }
            if (k>1) removeItemFromMapByValue(map, value); // >1, потому что 1 точно будет -- сравнение с самим собой.

        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

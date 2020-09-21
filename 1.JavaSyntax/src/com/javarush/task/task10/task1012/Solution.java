package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        HashMap<Character,Integer> mapp = new HashMap<>();
        for (char c: alphabet ) {
                mapp.put(c,0);
        }
        for (String s : list) {
            for (char c:  s.toCharArray()) {
                for(Map.Entry<Character, Integer> entry : mapp.entrySet()){
                    if (entry.getKey().equals(c)){
                        entry.setValue(entry.getValue() + 1);
                    }
                }
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry : mapp.entrySet()) {
            res.add(entry.getKey() + " " + entry.getValue());
        }
        Collections.sort(res);
        String k = res.get(res.size()-1);
        res.add(6,k);
        res.remove(res.size()-1);
        for (String s : res) {
            System.out.println(s);
        }
    }

}

package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i < 5;i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();
        Collections.sort(list);
        for(int i : list){
            System.out.println(i);
        }
    }
}

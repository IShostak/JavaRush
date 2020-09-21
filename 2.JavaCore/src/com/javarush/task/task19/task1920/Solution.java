package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        double max = 0d;

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double>  map = new TreeMap<>();

        while (reader.ready()){
            String[] temp = reader.readLine().split(" ");
            String name =  temp[0];
            double sal = Double.parseDouble(temp[1]);

            if(map.containsKey(name)){
                double curval = map.get(name);
                double newSal = curval + sal;
                map.put(name, newSal);
            } else {
                map.put(name, sal);
            }
        }
        reader.close();
        ArrayList<String> list = new ArrayList();
        for(Map.Entry<String, Double> entry : map.entrySet()){
            if(entry.getValue() >=  max){
                max = entry.getValue();
            }
        }
        for(Map.Entry<String, Double> entry : map.entrySet()){
            if(entry.getValue() ==  max){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

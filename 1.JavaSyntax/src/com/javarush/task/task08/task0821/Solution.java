package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> pp = new HashMap<>();
        for (int i = 0; i < 7 ; i++) {
            pp.put(" "+ i, i+ " ");
        }
        pp.put("сема",  "пупкин");
        pp.put("сема",  "уткин");
        pp.put("вася",  "уткин");
        return pp;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

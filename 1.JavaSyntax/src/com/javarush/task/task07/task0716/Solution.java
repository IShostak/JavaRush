package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = list.size() -1; i >=0 ; i--) {
            if(list.get(i).contains("л") &&list.get(i).contains("р")){
            }
            if(list.get(i).contains("л")){
                String temp = list.get(i);
                list.add(i,temp);
            }
            if(list.get(i).contains("р")){
                list.remove(i);
            }

        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = list.size() -1; i >=0 ; i--) {
            res.add(list.get(i));
        }
        return res;
    }
}
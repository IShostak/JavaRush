package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> []  list = new ArrayList[3];
        list[0] =  new ArrayList<String>();
        list[1] = new ArrayList<String>();
        list[2] = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list[0].add("i: " + i);
            list[1].add("i: " + i);
            list[2].add("i: " + i);
        }


        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
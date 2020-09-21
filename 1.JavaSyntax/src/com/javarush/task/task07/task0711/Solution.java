package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            list.add(scanner.nextLine());
        }
        scanner.close();
        String temp = "";
        for (int i = 0; i < 13 ; i++) {
            temp = list.get(list.size()-1);
            list.remove(list.size() -1);
            list.add(0, temp);
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}

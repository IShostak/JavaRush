package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        String s = "";
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 5;i++){
            strings.add(sc.nextLine());
            if(strings.get(i).length() > s.length()){
                s = strings.get(i);
            }
        }

        System.out.println(s);
        for(int i =0; i < 5;i++){
            if(strings.get(i).length() ==  s.length() && strings.get(i) !=  s){
                System.out.println(strings.get(i));
            }
        }
    }
}

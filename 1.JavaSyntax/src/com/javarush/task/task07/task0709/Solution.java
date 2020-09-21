package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s = "";

        for(int i =0; i <5; i++){
            list.add(scanner.nextLine());
        }
        s = list.get(1);
        for(int i =0; i <5; i++){
            if(list.get(i).length() < s.length()){
                s = list.get(i);
            }
        }
        scanner.close();
        System.out.println(s);
        for(int i =0; i <list.size(); i++){
            if(list.get(i).length() == s.length() && list.get(i) != s){
                System.out.println(list.get(i));
            }
        }

    }
}

package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String shortest = scanner.nextLine();
        String longest = scanner.nextLine();
        int shind =0;
        int loind =0;
        list.add(shortest);
        list.add(longest);
        for(int i =0; i < 8; i++){
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).length() > longest.length()){
                longest = list.get(i);
                loind = i;
            }
            else if(list.get(i).length() < shortest.length()){
                shortest = list.get(i);
                shind = i;
            }
        }
        scanner.close();
        System.out.printf(loind < shind ? list.get(loind) : list.get(shind));
    }

}

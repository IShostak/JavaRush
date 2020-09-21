package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        int temp =0;
        int perm =0;
        for (int i = 0; i < list.size() -1; i++) {
            if(list.get(i).equals(list.get(i+1))){
                temp++;
                if(temp > perm){
                    perm = temp;
                }
            }
            else  temp =0;
        }
        System.out.println(perm+1);

    }
}
package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list23 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            list1.add(scanner.nextInt());
        }
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 3 == 0){
                list2.add(list1.get(i));
            }
            if(list1.get(i) %2 ==0){
                list3.add(list1.get(i));
            }
            if(list1.get(i) %2 !=0 && list1.get(i) % 3 != 0 ) list23.add(list1.get(i));
        }
        printList(list2);
        printList(list3);
        printList(list23);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <  list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

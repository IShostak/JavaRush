package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();
        FileInputStream fio = new FileInputStream(file);
        HashMap<Integer, Integer> map = new HashMap<>();
        while (fio.available()>0){
            map.put(fio.read(),0);
        }
        fio.close();
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.add(entry.getKey());
        }
        Collections.sort(list);
        for (int i :list ) {
            System.out.print(i+" ");
        }
    }
}

package com.javarush.task.task18.task1804;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();

        FileInputStream fio = new FileInputStream(file);
        HashMap<Integer, Integer> bytemap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int data = 0;
        int min = 128;
        while (fio.available()>0){
            data = fio.read();
            list.add(data);
        }
        fio.close();
        bytemap.put(list.get(0), 1);
        for (int i = 1; i< list.size(); i++){
            bytemap.put(list.get(i), 0);
        }
        for (Map.Entry<Integer, Integer> entry: bytemap.entrySet() ){
            for (int i: list) {
                if(entry.getKey().equals(i)){
                    entry.setValue(entry.getValue() +1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry: bytemap.entrySet() ) {
            if(entry.getValue()< min){
                min = entry.getValue();
            }
        }

        String res = "";
        for(Map.Entry<Integer, Integer> entry : bytemap.entrySet()){
            if(entry.getValue().equals(min)){
                res+=entry.getKey()+ " ";
            }
        }
        System.out.println(res);
    }
}

package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        try {
            filename = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(inputStream);
        ArrayList<Integer> list =  new ArrayList<>();
        while (scanner.hasNext()){
            int temp = scanner.nextInt();
            if(temp %2==0){
                list.add(temp);
            }
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
        Collections.sort(list);
        for (int i :
                list) {
            System.out.println(i);
        }

    }
}

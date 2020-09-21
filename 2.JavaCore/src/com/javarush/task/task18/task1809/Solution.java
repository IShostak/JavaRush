package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fio = new FileInputStream(sc.nextLine());
        FileOutputStream fos =  new FileOutputStream(sc.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fio.available() >0){
            list.add(fio.read());
        }
        sc.close();
        fio.close();
        for (int i = list.size()-1; i > -1 ; i--) {
            fos.write(list.get(i));
        }
        fos.close();

    }
}

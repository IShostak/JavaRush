package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        ArrayList<Character> list = new ArrayList<Character>();
        FileReader r = new FileReader(file1);
        FileWriter w = new FileWriter(file2);
        while (r.ready()){
            list.add((char) r.read());
        }
        for(int i = 1; i<list.size();i+=2){
            w.write(list.get(i));
        }
        r.close();
        w.close();
    }
}

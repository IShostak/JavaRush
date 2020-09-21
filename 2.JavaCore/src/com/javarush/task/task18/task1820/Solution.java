package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        reader.close();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        while (reader1.ready()){
            String line = reader1.readLine();
            for(String s :  line.split(" ")){
                double d = 0.0;
                if(!s.equals("")){
                    try {
                     d = Double.parseDouble(s);
                    } catch (NumberFormatException e) {
                        System.out.println("not a number");
                        continue;
                    }
                    long res = Math.round(d);
                    bw.write(res + " ");
                }
            }
        }
        reader1.close();
        bw.close();

    }
}

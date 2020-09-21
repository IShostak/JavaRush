package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws  Exception {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = fileNameReader.readLine();
        String file2 = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()){
            int num = 0;
            String data[] = reader.readLine().split(" ");
        phase1:    for ( String s : data ) {

                try {

                  num = Integer.parseInt(s);

                } catch (NumberFormatException e) {
                  continue phase1;
                }
            writer.write(num+" ");
            }

        }
        reader.close();
        writer.close();
    }
}

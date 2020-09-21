package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader fileNameReader =
                new BufferedReader(new InputStreamReader(System.in));
        String file1 = fileNameReader.readLine();
        String file2 = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()) {
            String line = reader.readLine();
            writer.write(line.replaceAll("[\\p{Punct}\\n]", ""));
        }

        reader.close();
        writer.close();
    }
}

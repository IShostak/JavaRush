package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader fileNamesReader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = fileNamesReader.readLine();
//        String file2 = fileNamesReader.readLine();
//        fileNamesReader.close();
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        Pattern pattern  = Pattern.compile("\\d");

        while (reader.ready()) {
            String[] lines  = reader.readLine().split(" ");
            for (String s :  lines){
                if (pattern.matcher(s).find()) {
                    writer.write(s + " ");
                }
            }
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}

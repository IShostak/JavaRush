package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws  Exception {
        String res = "";
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()) {
            String[] text = reader.readLine().split(" ");
            for(String s : text) {
                if(s.length() > 6) res += s +",";
            }
        }
        reader.close();
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));
        fw.write(res.substring(0, res.length()-1));
        fw.close();
    }
}

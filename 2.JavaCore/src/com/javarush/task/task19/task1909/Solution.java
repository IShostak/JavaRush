package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = fileNameReader.readLine();
        String file2 = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()) {
            String data = reader.readLine();
            String ress = "";
            if(data.length() >0 ) {
                char[] res = data.toCharArray();
                for (char c : res) {
                    if(c ==  '.'){
                        ress+='!';
                    }
                    else ress+=c;
                }
            }
            writer.write( ress );
        }

        reader.close();
        writer.close();
    }
}

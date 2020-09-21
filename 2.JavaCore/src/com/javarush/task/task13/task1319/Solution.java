package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String file = reader.readLine();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
      String s = "";
      while(true){
          s = reader.readLine();
          if(s.equals("exit")){
              fileWriter.write("exit");
              break;
          }
          else fileWriter.write(s + "\n");
      }
      reader.close();
      fileWriter.close();
      writer.close();
    }
}

package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        double t =Double.parseDouble(reader.readLine());
        reader.close();
        double te;
        if(t >5){
            te  = t%5;}
            else if(t ==5){
            te =1;
        }
            else te = t;



        if(te < 3){
            System.out.println("зелёный");
        }
        else if (te >=3 && te <4){
            System.out.println("жёлтый");
        }
        else if (te >=4 && te <5){
            System.out.println("красный");
        }
    }
}
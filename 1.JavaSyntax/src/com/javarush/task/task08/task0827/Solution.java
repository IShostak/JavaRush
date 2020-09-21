package com.javarush.task.task08.task0827;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)  throws  Exception{

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("MMM d yyyy");

        Date date1 = new Date();
        Date date2 = new Date();
        date2 = format.parse(date);
        date2.setMonth(0);
        date2.setDate(1);
        date1 = format.parse(date);
        long dif = date1.getTime() - date2.getTime();
        int day = (int)(dif/(24*60*60*1000));
         if(day%2  > 0) {
             return false;
         }
        else {return true;}
    }
}

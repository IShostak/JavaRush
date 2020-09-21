package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        for (int i = 0; i < 9; i++) {
           map.put("Stallone"+i, df.parse("JUNE 1 1980"));
        }


        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Date> pair = it.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                it.remove();
            }

        }
    }

    public static void main(String[] args) throws Exception {


    }
}

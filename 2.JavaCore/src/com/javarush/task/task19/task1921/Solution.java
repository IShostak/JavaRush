package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()){
            String[] data = reader.readLine().split(" ");
            String date = data[data.length -3] + " " + data[data.length -2]+ " " + data[data.length -1];
            String name = "";
            for (int i =0; i  < data.length - 3; i++) {
                name += data[i]+ " ";
            }
            name = name.substring(0, name.length()-1);

            System.out.println(name);
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.set(1993,05, 12);

            Date birthday = new SimpleDateFormat("dd MM yyyy").parse(date);
            System.out.println(birthday);
            PEOPLE.add(new Person(name, birthday));
        }
        reader.close();

    }
}

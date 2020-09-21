package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void Crud(String[] text){
//        String text[]= arguments.split(" ");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (text[0]){//first argument is a command
            // create new person in allPeople
            case "-c": {
                for (int i = 1; i < text.length ; i+=3) {
                    String name = text[i]; //second arg - name
                    Date birthday = null;
                    try {
                        birthday = format.parse(text[i+2]);
                    } catch (ParseException e) {

                    }
                    Person p1 = null;
                    if (text[i+1].equals("ж")) {
                        p1 = Person.createFemale(name, birthday);
                    } else if(text[i+1].equals("м")) p1 = Person.createMale(name, birthday);

                    allPeople.add(p1);
                    System.out.println(allPeople.size() - 1);
                }

                break;
            }
            //update information in allPeople according to id
            case "-u":{
                for (int i =1; i < text.length;i +=4) {
                    int id =Integer.parseInt(text[i]);
                    String name = text[i+1];
                    Date birthday = null;
                    try {
                        birthday = format.parse(text[i+3]);
                    } catch (ParseException e) {

                    }
                    Person p1 = null;
                    if (text[i+2].equals("ж")) {
                        p1 = Person.createFemale(name, birthday);
                    } else if(text[i+2].equals("м")) p1 = Person.createMale(name, birthday);

                    allPeople.remove(id);
                    allPeople.add(id,p1);
                }

                break;
            }
            // delete information(change to null
            case "-d":{
                for (int i = 1; i < text.length; i++) {
                    int id =Integer.parseInt(text[i]);
                    Person p1 = allPeople.get(id);
                    p1.setName(null);
                    p1.setBirthDate(null);
                    p1.setSex(null);
                }
                break;
            }

//            show info
            case "-i":{
                SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
                for (int i = 1; i < text.length ; i++) {
                    int id =Integer.parseInt(text[i]);
                    Person p1 = allPeople.get(id);
                    String name = p1.getName();
                    Date birthday = p1.getBirthDate();
                    String sex = (p1.getSex().equals(Sex.MALE)) ? "м":"ж";
                    System.out.printf("%s %s %s%n", name, sex, format1.format(birthday));
                }

                break;
            }
        }

    }


    public static void main(String[] args) {
        Crud(args);

//        String s = "-c Vasya м 10/05/1993 name2 ж 10/06/1993";
//        String[] ss = s.split(" ");
//     Crud(ss);
//     s = "-i 1 2 3";
//     ss = s.split(" ");
//     Crud(ss );

    }
}

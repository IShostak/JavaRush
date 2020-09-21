package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void Crud(String[] text){
//        String text[]= arguments.split(" ");
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (text[0]){
            // create new person in allPeople
            case "-c": {
                String name = text[1];
                Date birthday = null;
                try {
                    birthday = format.parse(text[3]);
                } catch (ParseException e) {

                }
                Person p1 = null;
                if (text[2].equals("ж")) {
                    p1 = Person.createFemale(name, birthday);
                } else if(text[2].equals("м")) p1 = Person.createMale(name, birthday);

                allPeople.add(p1);
                System.out.println(allPeople.size() - 1);
                break;
            }
            //update information in allPeople according to id
            case "-u":{
                int id =Integer.parseInt(text[1]);
                String name = text[2];
                Date birthday = null;
                try {
                    birthday = format.parse(text[4]);
                } catch (ParseException e) {

                }
                Person p1 = null;
                if (text[3].equals("ж")) {
                    p1 = Person.createFemale(name, birthday);
                } else if(text[3].equals("м")) p1 = Person.createMale(name, birthday);

                allPeople.remove(id);
                allPeople.add(id,p1);

                break;
            }
            // delete information(change to null
            case "-d":{
                int id =Integer.parseInt(text[1]);
                Person p1 = allPeople.get(id);
                p1.setName(null);
                p1.setBirthDate(null);
                p1.setSex(null);
                break;
            }

//            show info
            case "-i":{
                SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
                int id =Integer.parseInt(text[1]);
                Person p1 = allPeople.get(id);
                String name = p1.getName();
                Date birthday = p1.getBirthDate();
                String sex = (p1.getSex().equals(Sex.MALE)) ? "м":"ж";
                System.out.printf("%s %s %s%n", name, sex, format1.format(birthday));
                break;
            }
        }

    }


    public static void main(String[] args) {
        Crud(args);


//        Crud("-c Миронов м 15/04/1990");
//        System.out.println(allPeople.get(2).getSex());
//        System.out.println(allPeople.get(2).getBirthDate().getDate()+" " + allPeople.get(2).getBirthDate().getMonth()+
//                " "+ allPeople.get(2).getBirthDate().getYear() );
//
//        Crud("-i 2");
//        Crud("-u 2 vasya ж 12/03/1965");
//        System.out.println(allPeople.get(2).getSex());
//        Crud("-i 2");
//        Crud("-d 2");
//        Crud("-i 2");

    }
}

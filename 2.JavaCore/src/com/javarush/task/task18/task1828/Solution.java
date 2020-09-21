package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        if(args.length > 0) {
            if (args[0].equals("-c")) {
                crudCreate(args);
            } else if (args[0].equals("-d")) {
                crudDelete(args);
            } else if (args[0].equals("-u")) {
                crudUpdate(args);
            }
        }
//        String test1[] = { "-c", "Шорты пляжные синие", "159.00", "12"};
//        String test2[] = { "-u", "19847", "Шdsglksdjj", "112.00", "10"};
//        String test3[] = { "-d", "19847984"};
//
////        crudCreate(test1);
//        crudUpdate(test2);
////        crudDelete(test3);

    }

    public static void Crud(String[] ar) throws Exception {

    }

    private static void crudDelete(String[] args) throws Exception {
        //Getting filename
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        scanner.close();

        String res = "";
        long maxId = 0;

        Scanner scanner1  = new Scanner(new FileInputStream(filePath));
        BufferedReader rea  = new BufferedReader(new FileReader(filePath));
        ArrayList<String> fileContent = new ArrayList<>();

        while(rea.ready()) {
            String data = rea.readLine();
            long id = 0;
            try {
                if(data.length() > 0){
                    //finding id in the File
                    String idNumber = data.substring(0, 8);
                    idNumber = idNumber.split(" ")[0];
                    id = Long.parseLong(idNumber);

                    //If id equals needed:
                    if(id == Integer.parseInt(args[1])) {

                    } else {
                        fileContent.add(data);
                    }
                }

            } catch (NumberFormatException e) {}
        }
        rea.close();
        scanner1.close();


        //Writing to file
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        if (fileContent.size() > 0) {
            for (String s : fileContent) {
                bw.write(s);
                bw.write("\n");
            }
        }

        bw.close();
    }

    private static void crudUpdate(String[] args) throws Exception {
        //Getting filename
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        scanner.close();
        String res = "";
        long maxId = 0;

        //Getting data from array and converting it before writing
        String productname = stringChanger(args[2], 30);
        String price = stringChanger(args[3], 8);
        String quantity = stringChanger(args[4], 4);

        Scanner scanner1  = new Scanner(new FileInputStream(filePath));
        BufferedReader rea  = new BufferedReader(new FileReader(filePath));
        ArrayList<String> fileContent = new ArrayList<>();

        while(rea.ready()) {
            String data = rea.readLine();
            long id = 0;
            try {
                if(data.length() > 0){
                    //finding id in the File
                    String idNumber = data.substring(0, 8);
                    idNumber = idNumber.split(" ")[0];
                    id = Long.parseLong(idNumber);
                    //If id equals needed:
                    if(id == Integer.parseInt(args[1])) {
                        //Getting and writing final result string to array
                        String idd =  stringChanger(String.valueOf(id), 8);
                        res = idd + productname +  price + quantity;
                        System.out.printf("%s was added to filecontent \n", res);
                        fileContent.add(res);
                    } else {
                        System.out.printf("%s was added to filecontent \n", res);
                        fileContent.add(data);
                    }
                }

            } catch (NumberFormatException e) {}
        }
        rea.close();
        scanner1.close();


        //Writing to file

        if (fileContent.size() > 0) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            for (String s : fileContent) {
                bw.write(s);
                bw.write("\n");
            }
            bw.close();
        }


    }

    private static void crudCreate(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        scanner.close();

        String res = "";
        long maxId = 0;


        String productname = stringChanger(args[1], 30);
        String price = stringChanger(args[2], 8);
        String quantity = stringChanger(args[3], 4);

        Scanner scanner1  = new Scanner(new FileInputStream(filePath));
        BufferedReader rea  = new BufferedReader(new FileReader(filePath));

        while(scanner1.hasNext()){
            String data = scanner1.nextLine();

            long id = 0;
            try {

                if(data.length() > 0){
                    String idNumber = data.substring(0, 8);
                    idNumber = idNumber.split(" ")[0];


                    id = Long.parseLong(idNumber);

                }

            } catch (NumberFormatException e) {

            }

            if (id > maxId) maxId = id;

        }
        //getting MAX ID
        String idd =  stringChanger(String.valueOf(maxId +1), 8);

        rea.close();
        scanner1.close();
        //Getting final result string
        res = idd + productname +  price + quantity;

        //Writing to file
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
        bw.write("\n");
        bw.write(res);
        bw.close();
    }
        //full String with spaces
    private static String stringChanger(String s, int length) {
        String res=  s;

        if(res.length()<length){
            while(res.length() < length){
                res+=" ";
            }
        }

        return  res;
    }
}


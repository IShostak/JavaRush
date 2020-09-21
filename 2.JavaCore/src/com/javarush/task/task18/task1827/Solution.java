package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        if(args.length > 0) {
            if (args[0].equals("-c")) {
                Crud(args);
            }
        }
//        String test[] = {"-c", "Шорты пляжные синие", "159.00", "12" };
//        Crud(test);

    }

    public static void Crud(String[] args) throws Exception {
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
        System.out.println(maxId);

        String idd =  stringChanger(String.valueOf(maxId +1), 8);


        rea.close();


        res = idd + productname +  price + quantity;
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
        bw.write("\n");
        bw.write(res);
        bw.close();
    }

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

package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfn = reader.readLine();
        Cat gf = new Cat(gfn, null,null);

        String gmn = reader.readLine();
        Cat gm = new Cat(gmn, null,null);

        String fatn = reader.readLine();
        Cat fat = new Cat(fatn, null,gf);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,gm,null);

        String sonn = reader.readLine();
        Cat son = new Cat(sonn,catMother,fat);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,fat);


        System.out.println(gf);
        System.out.println(gm);
        System.out.println(fat);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat parent, Cat father) {
            this.name = name;
            this.parent = parent;
            this.father = father;
        }

        @Override
        public String toString() {
            String res = "The cat's name is " + name;
            if (parent == null)
               res +=  ", no mother ";
            else
                res += ", mother is " + parent.name;
            if (father == null)
                res += ", no father ";
            else
               res +=  ", father is " + father.name;
            return  res;
        }
    }

}

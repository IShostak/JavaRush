package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if  (!(o instanceof Solution) ){
            return false;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(first, solution.first) &&
                Objects.equals(last, solution.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }
//    public boolean equals(Solution n) {
//        System.out.println("equals called");
//        System.out.println(n.first.equals(first));
//        System.out.println(n.last.equals(last));
//        if ( n == null ) {
//            return  false;
//        }
//        if ( n.getClass() !=  this.getClass() ) {
//            return false;
//        }
//        return n.first.equals(first) && n.last.equals(last);
//    }
//
//    public int hashCode() {
//        return first.hashCode() + last.hashCode();
//    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        s.add(new Solution("Donald", "Duck"));
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

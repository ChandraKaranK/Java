package com.JavaAssignment.assignment6;

import java.util.Arrays;

public class test {


    public static void main(String args[]) {
System.out.println(11*99);
        System.out.println(99*99);
        System.out.println(111*111);
        System.out.println(111*999);
        System.out.println(999*999);
    String s = String.valueOf(999*999);
    char digits[] = s.toCharArray();
        Arrays.sort(digits);
        for (char ch:digits)
            System.out.println(ch);
        s = new String(digits);
        System.out.println(s);
        char a[] = new char[]{'0','0','1','8','9','9'};
        String s1 = new String(a);
        System.out.println(s.equals(s1));
    }
}

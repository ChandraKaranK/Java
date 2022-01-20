package com.corejava;

import java.util.Scanner;

public class ParallelArrays {

    static String names[] = new String[5];
    static int ages[] = new int[5];

     static void readNames()
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter name for person " + (i + 1));
            names[i] = sc.nextLine();
        }
    }


    static void readAges()
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter age for person " + (i + 1));
            ages[i] = sc.nextInt();
        }
    }

    public static void main(String args[])
    {
        readNames();
        readAges();
        for (int i=0;i<5;i++)
            System.out.println(names[i]+" is "+ages[i]+" years old");
    }

}

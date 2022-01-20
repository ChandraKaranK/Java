package com.corejava;

import java.util.Scanner;

public class Array {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];

        for (int i=1;i<=array.length;i++)
        {
            System.out.println("Enter array element "+i);
            array[i-1] = sc.nextInt();
        }

        int arraymultiple[] = new int[5];

        System.out.println("Array elements multiplies by 2:");
        for (int i=0;i<array.length;i++)
        {
            arraymultiple[i] = 2*array[i];
            System.out.println(arraymultiple[i]);
        }
    }
}

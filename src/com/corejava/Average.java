package com.corejava;

import java.util.Scanner;

public class Average {

    public static void main(String []args)
    {
        System.out.println("Average of three numbers");
        Scanner sc = new Scanner(System.in);
        double average;
        double sum=0;

        for (int i=1;i<=3;i++)
        {
            System.out.println("Enter number "+i+":");
            sum = sum + sc.nextDouble();
        }
        System.out.println("Average of three numbers is:"+(sum/3));

    }
}

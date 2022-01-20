package com.corejava;

import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%3==0)
            System.out.println(number+" is divisble by 3");
        else
            System.out.println(number+" is not divisble by 3");
    }

}

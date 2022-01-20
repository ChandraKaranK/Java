package com.corejava;

import java.util.Scanner;

public class LearningPackages {

    static void displayPackages()
    {
        System.out.println("Packages available:");
        System.out.println("Learning package 1");
        System.out.println("$10/month, includes 2 courses per month");
        System.out.println("Each additional course is $6");
        System.out.println("Learning package 2");
        System.out.println("$12/month, includes 4 courses per moonth");
        System.out.println("Each additional course is $4");
        System.out.println("Learning package 3");
        System.out.println("$15/month, includes 6 courses per moonth");
        System.out.println("Each additional course is $3");
    }

    static void selectPackage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the package(i.e 1,2 or 3)");
        int selected = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter no of courses:");
        int totalCourses =   sc.nextInt();
        generateBill(selected,totalCourses);

    }

    static void generateBill(int selected, int totalCourses)
    {
        int bill = 0;
        if(selected==1)
            bill = 10 + (totalCourses-2)*6;
        else if(selected==2)
            bill = 12 + (totalCourses-4)*4;
        else if(selected==3)
            bill = 15 + (totalCourses-6)*3;
        else
            System.out.println("Select valid package");
        System.out.println("The total bill for packages of the month is "+bill);
    }

    public static void main(String args[])
    {
        displayPackages();
        selectPackage();
    }

}

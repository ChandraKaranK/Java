package com.corejava;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    String names[];

    void scanArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraySize = sc.nextInt();
        names = new String[arraySize];
        sc.nextLine();
        for (int i=0;i<arraySize;i++)
        {
            String name = sc.next();
            names[i] = name;
        }
    }

    void printArray()
    {
        for (int i=0;i<names.length;i++)
            System.out.println(names[i]);
    }

    void printArraylist(ArrayList<String> namesList)
    {
        for (String name:namesList)
            System.out.println(name);
    }

    public static void main(String args[])
    {
        Arraylist obj = new Arraylist();

        obj.scanArray();
        obj.printArray();

        ArrayList<String> list = new ArrayList<>();
        list.add("chandra");
        list.add("karan");
        list.add("reddy");

        obj.printArraylist(list);


    }
}

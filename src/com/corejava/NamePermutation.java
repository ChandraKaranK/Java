package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutation {

    ArrayList<String> firstnames = new ArrayList();
    ArrayList<String> lastnames = new ArrayList();


    void splitNames(String[] fullNames)
    {
        for (int i = 0; i < 5; i++) {
            String names[] = fullNames[i].split(" ");
            firstnames.add(names[0]);
            lastnames.add(names[1]);
            }
    }

    void printPermutations()
    {
        for (int i=0;i<firstnames.size();i++)
        {
            for (int j=0;j<lastnames.size();j++)
                System.out.println(firstnames.get(i)+" "+lastnames.get(j));
        }
    }

    public static void main(String args[])
    {
        String fullNames[] =new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            System.out.println("Enter name "+(i+1));
            fullNames[i] = sc.nextLine();
        }

        NamePermutation n = new NamePermutation();
        n.splitNames(fullNames);
        n.printPermutations();

    }


}

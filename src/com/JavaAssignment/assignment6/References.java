package com.JavaAssignment.assignment6;

public class References {

    References(String text)
    {
        System.out.println(text);
    }

    public static void main(String []args)
    {
        int array_size=5;
        References []references =new References[array_size];

        for (int i =0;i<array_size;i++)
        {
            references[i] = new References("Hi Everyone");
        }
    }

}

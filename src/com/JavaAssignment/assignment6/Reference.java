package com.JavaAssignment.assignment6;

public class Reference {

    Reference(String text)
    {
        System.out.println(text);
    }

    public static void main(String []args)
    {
        int array_size=5;
        Reference []references =new Reference[array_size];
        Reference r1 = new Reference("hii");
    }
}

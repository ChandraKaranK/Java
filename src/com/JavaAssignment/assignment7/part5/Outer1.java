package com.JavaAssignment.assignment7.part5;

public class Outer1 {

    Outer1()
    {
        System.out.println("Outer1 default constructor");
    }

    public class Inner1{

        Inner1()
        {
            System.out.println("Inner1 default constructor");
        }

        Inner1(String name)
        {
            System.out.println("Hi "+name);
        }

        void sayHi()
        {
            System.out.println("Hi from Outer1.Inner1");
        }
    }

}

package com.JavaAssignment.assignment7.part5;

public class Outer2 extends Outer1{

    Outer2()
    {
        System.out.println("Outer2 default constructor");
    }

    public class Inner2 extends Inner1{

        Inner2()
        {
            System.out.println("Inner2 default constructor");
        }

        Inner2(String name)
        {
            System.out.println("Hi "+name);
        }

    }

    public static void main(String args[])
    {
        Outer2 outer = new Outer2();
        Outer2.Inner2 inner2 = outer.new Inner2("chandra");
        inner2.sayHi();
    }

}

package com.JavaAssignment.assignment5.singleton;

public class Singleton {

    String my_name;

    public static Singleton set_name(String name)
    {
       // my_name = name;
        // non-static member can't be used in a static context.i.e my_name(non-static) can't be used in this static method.

        return new Singleton();
    }

    public void print_name()
    {
        System.out.println("My name is "+my_name);
    }

}

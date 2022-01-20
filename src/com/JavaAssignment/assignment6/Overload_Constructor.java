package com.JavaAssignment.assignment6;

public class Overload_Constructor {
    public String my_name = "ChandraKaran Reddy";
    public int my_age;

   public Overload_Constructor()
    {
        System.out.println("In constructor with no parameters");
        System.out.println("My name is "+my_name);

    }
    public Overload_Constructor(int age)
    {
        this();
        System.out.println("In constructor with 'int age' as parameter");
        my_age = age;
        System.out.println("My age is "+my_age);
    }

    public static void main(String []args)
    {
        Overload_Constructor object = new Overload_Constructor(21);
    }
}

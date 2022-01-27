package com.lambdas.functionalinterfaces;

public class FunctionalInterface2 implements Greeting1 {


    @Override
    public void sayHi(String name) {
        System.out.println("Hi "+name);
    }

    public static void main(String args[])
    {
        FunctionalInterface2 f = new FunctionalInterface2();
        f.sayHi("Raju");
        f.sayGreeting();
        Greeting1.sayHello("ChandraKaran");
    }

}

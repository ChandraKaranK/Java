package com.lambdas.functionalinterfaces;

public class FunctionalInterface implements Greeting {

    @Override
    public void sayHi(String name) {
        System.out.println("Hi "+name);
    }


    public static void main(String args[])
    {
        FunctionalInterface f = new FunctionalInterface();
        f.sayHi("ChandraKaran");
    }
}

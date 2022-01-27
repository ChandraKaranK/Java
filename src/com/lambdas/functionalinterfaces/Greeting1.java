package com.lambdas.functionalinterfaces;

@java.lang.FunctionalInterface
public interface Greeting1 {

    void sayHi(String name);

    default void sayGreeting()
    {
        System.out.println("Hi Chandra");
    }

    static void sayHello(String name)
    {
        System.out.println("Hello "+name);
    }
}

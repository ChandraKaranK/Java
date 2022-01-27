package com.lambdas.methodreferences;

public class MethodReference {


    void sayGreeting(String name)
    {
        System.out.println("Hi "+name);
    }

    public static void main(String args[])
    {
        Greeting g = (s)->{System.out.println("Hi "+s);};
        g.sayHi("ChandraKaran");
        MethodReference reference = new MethodReference();
        Greeting g1 = reference::sayGreeting;
        g1.sayHi("CK");
    }

}

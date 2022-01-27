package com.JavaAssignment.assignment7.part1;

public class Rodent {

    Rodent()
    {
        System.out.println("This is from Rodent class");
    }
    public void run()
    {
        System.out.println("Rodent is running");
    }

    public void eat()
    {
        System.out.println("Rodent is eating");
    }

    public void jump()
    {
        System.out.println("Rodent is jumping");
    }

    public static void main(String []args)
    {
        Rodent []r = new Rodent[4];
        r[0] = new Rodent();
        r[1] = new Hamster();
        r[2] = new Gerbil();
        r[3] = new Mouse();

        for (int i=0;i<4;i++)
        {
            r[i].eat();
            r[i].jump();
            r[i].run();
        }
    }
}

package com.JavaAssignment.assignment7.part2;

public class CycleDemo {

    public static void main(String []args)
    {
        Cycle cycles[] = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (int i=0;i<cycles.length;i++)
        {
            // cycles[i].balance();
            //  Static binding happens and gives error as Cycle has no method called 'balance()'
        }

        Unicycle unicycle = (Unicycle)cycles[0];
        Bicycle bicycle = (Bicycle)cycles[1];
        Tricycle tricycle = (Tricycle)cycles[2];

        unicycle.balance();
        bicycle.balance();
        //tricycle.balance(); // Tricycle class has no 'balance()' method

    }

}

package com.JavaAssignment.assignment7.part4;

import java.util.Scanner;

public class CycleDemo {

    public static void main(String []args)
    {
        System.out.println("Enter the cycle type name:");
        Scanner sc = new Scanner(System.in);
        String cycleType = sc.next();
        Cycle cycle = CycleFactory.getCycle(cycleType);
        cycle.move();
        cycle.increaseSpeed();
        cycle.applyBrake();
    }

}

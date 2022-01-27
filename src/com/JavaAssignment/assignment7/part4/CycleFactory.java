package com.JavaAssignment.assignment7.part4;

public class CycleFactory {

    static Cycle getCycle(String cycleType)
    {
        String cycle = cycleType.toLowerCase();
        if(cycle.equals("unicycle"))
            return new Unicycle();
        else if(cycle.equals("bicycle"))
            return new Bicycle();
        else if(cycle.equals("tricycle"))
            return new Tricycle();
        else
            System.out.println("Enter a valid cycle type");
        return null;
    }

}

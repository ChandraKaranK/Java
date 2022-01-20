package com.corejava;

import java.util.ArrayList;

public class SumOfElements {


    static void sumOfElements(ArrayList<Integer> numbers)
    {
        int sum = 0;
        for (int i=0;i<numbers.size();i++)
        {
            sum+=numbers.get(i);
        }
        System.out.println("Sum of elements is:"+sum);
    }

    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(12);
        sumOfElements(numbers);

    }

}

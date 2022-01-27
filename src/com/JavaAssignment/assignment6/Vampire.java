package com.JavaAssignment.assignment6;

import java.util.*;

public class Vampire {

    HashSet<Long> vampireNumbers = new HashSet<>();

    String sortNumber(String number)
    {
        char[] digitsOfNumber = number.toCharArray();
        Arrays.sort(digitsOfNumber);
        return new String(digitsOfNumber);
    }

    void generateVampireNumbers()
    {
        long low = 10, high = 100 ;
        int count = 0;

        while(count < 100) {

            for (long i = low+1; i < high; i++) {

                for (long j = low+1; j < high; j++) {

                    String number1 = String.valueOf(i * j);
                    String number1Sorted = sortNumber(number1);

                    String number2 = String.valueOf(i) + j;
                    String number2Sorted = sortNumber(number2);

                    if (number1Sorted.equals(number2Sorted))
                    {
                        vampireNumbers.add(i * j);
                        count++;
                    }
                }
            }
            low = low*10;
            high = high*10;
        }
    }


    public static void main(String args[])
    {
        Vampire v = new Vampire();

        v.generateVampireNumbers();

        ArrayList<Long> vampireList = new ArrayList<>(v.vampireNumbers);

        Collections.sort(vampireList);

        for (Long vampire:vampireList)
            System.out.println(vampire);

    }

}

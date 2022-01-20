package com.corejava;

import java.util.Scanner;

public class GuessingNumber {

    public static void main(String args[])
    {
        int number = (int)(Math.random()*100);
        System.out.println(number);
        int guessCount = 0;
        System.out.println("Computer guessed the number");
        System.out.println("Guess a number betweem 1 and 100");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while(number!=guess)
        {
            if(guess<1 || guess>100)
                System.out.println("Guess a number betweem 1 and 100");
            else if(guess < number)
                System.out.println("You guessed lower number");
            else
                System.out.println("You guessed higher number");
            guess = sc.nextInt();
            guessCount+=1;
        }
        System.out.println("Wow,you guessed the number correctly in "+guessCount +" attempts");
    }

}

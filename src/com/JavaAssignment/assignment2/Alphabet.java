package com.JavaAssignment.assignment2;
import java.util.HashSet;
import java.util.Scanner;

public class Alphabet {

    public void check_alphabets(String input)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input_string = input.toLowerCase();

        HashSet<Character> alphabets = new HashSet<Character>();
        for(int index=0;index<alphabet.length();index++)
            alphabets.add(alphabet.charAt(index));

        HashSet<Character> input_string_alphabets = new HashSet<Character>();
        for(int index = 0;index < input_string.length(); index++)
            input_string_alphabets.add(input_string.charAt(index));

        if(!(input_string_alphabets.containsAll(alphabets)))
            System.out.println("Given input string doesn't contain all the alphabets");
        else
            System.out.println("Given input string contains all the alphabets");


    }

    public static void main(String[] chandra)
    {
        Alphabet a = new Alphabet();

        String input_string;
        System.out.print("Enter the input string");
        Scanner sc = new Scanner(System.in);
        input_string = sc.nextLine();
        a.check_alphabets(input_string);

    }
}

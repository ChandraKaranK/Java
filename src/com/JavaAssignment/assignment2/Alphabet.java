package com.JavaAssignment.assignment2;
import java.util.HashSet;
import java.util.Scanner;

public class Alphabet {

    // Time complexity: Time complexity of the program depends on inputStringAlphabets.containsAll(alphabets)
    // HashSet(h).containsAll() is O(HashSet(h).size())
    // i.e Time complexity: O(n) where 'n' is the size of set of inputString( n = size of inputString in worst case)
    // Similarly, Space Complexity: O(n)

    public void checkAlphabets(String input)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String inputString = input.toLowerCase();

        HashSet<Character> alphabets = new HashSet<Character>();
        for(int index=0;index<alphabet.length();index++)
            alphabets.add(alphabet.charAt(index));

        HashSet<Character> inputStringAlphabets = new HashSet<Character>();
        for(int index = 0;index < inputString.length(); index++)
            inputStringAlphabets.add(inputString.charAt(index));

        if(!(inputStringAlphabets.containsAll(alphabets)))
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
        a.checkAlphabets(input_string);

    }
}

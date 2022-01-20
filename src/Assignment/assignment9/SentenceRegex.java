package Assignment.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SentenceRegex {

    public static void main(String []args)
    {
        System.out.println("Enter the sentence to be validated");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String sentencePattern = "^[A-Z]+[a-zA-Z0-9\\u0020]*.$";
        if(Pattern.matches(sentencePattern,sentence))
            System.out.println("Sentence is valid");
        else
            System.out.println("Sentence is invalid");
    }
}

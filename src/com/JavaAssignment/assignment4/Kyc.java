package com.JavaAssignment.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Kyc {

    static int noOfInputs;
    static ArrayList<String> formDates = new ArrayList<>();

    void generateDates()
    {
        System.out.println("Enter the no of inputs");
        Scanner sc = new Scanner(System.in);
        noOfInputs = sc.nextInt();
        sc.nextLine();
        ArrayList<String> signupDates = new ArrayList<>();
        ArrayList<String> currentDates = new ArrayList<>();

        System.out.println("Enter the sign up date followed by current date with a space in between them");

        for(int i = 0; i < noOfInputs; i++) {

            String signupAndFormDate = sc.nextLine();
            String dates[] = signupAndFormDate.split(" ");
            signupDates.add(dates[0]);
            currentDates.add(dates[1]);
        }
        generateLocalDates(signupDates,currentDates);
    }

    void generateLocalDates(ArrayList<String> signupDates,ArrayList<String> currentDates)
    {

        ArrayList<LocalDate> signupLd = new ArrayList<>();
        ArrayList<LocalDate> currentLd = new ArrayList<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (int i = 0; i < noOfInputs; i++)
        {
            String signup = signupDates.get(i);
            String current = currentDates.get(i);
            LocalDate ld1 = LocalDate.parse(signup,dtf);
            LocalDate ld2 = LocalDate.parse(current,dtf);
            signupLd.add(ld1);
            currentLd.add(ld2);
        }
        getFormDates(signupLd,currentLd);
    }

    void getFormDates(ArrayList<LocalDate> signupLd,ArrayList<LocalDate> currentLd)
    {

        for(int i=0 ; i< noOfInputs; i++)
        {
            LocalDate signup = signupLd.get(i);
            LocalDate current = currentLd.get(i);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate rangeFrom;
            LocalDate rangeTo = current;
            if(signup.isAfter(current))
                formDates.add("no range");
            else
            {
                int year = current.getYear();
                LocalDate temp = signup.withYear(year);
                rangeFrom = temp.minusDays(30);
                if(!(temp.plusDays(30).isAfter(current)))
                    rangeTo = temp.plusDays(30);
                formDates.add(formatter.format(rangeFrom)+" "+formatter.format(rangeTo));
            }

        }
    }


    public static void main(String []args)
    {
       Kyc k = new Kyc();
       k.generateDates();

        for (int i=0;i<noOfInputs;i++)
        {
            System.out.println(formDates.get(i));
        }


    }
}

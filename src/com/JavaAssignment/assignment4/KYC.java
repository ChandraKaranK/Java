package com.JavaAssignment.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class KYC {

    public static void main(String []args)
    {
        System.out.println("Enter the no of inputs");
        Scanner sc = new Scanner(System.in);
        int no_of_inputs;
        no_of_inputs = sc.nextInt();
        sc.nextLine();
        ArrayList<String> signup_dates = new ArrayList<>();
        ArrayList<String> current_dates = new ArrayList<>();

        System.out.println("Enter the sign up date followed by current date with space in between them");

        for(int i = 0; i < no_of_inputs; i++) {

            String signup_and_form_date = sc.nextLine();
            String dates[] = signup_and_form_date.split(" ");
            signup_dates.add(dates[0]);
            current_dates.add(dates[1]);
        }

        ArrayList<LocalDate> signup_ld = new ArrayList<>();
        ArrayList<LocalDate> current_ld = new ArrayList<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (int i = 0; i < no_of_inputs; i++)
        {
            String signup = signup_dates.get(i);
            String current = current_dates.get(i);
            LocalDate ld1 = LocalDate.parse(signup,dtf);
            LocalDate ld2 = LocalDate.parse(current,dtf);
            signup_ld.add(ld1);
            current_ld.add(ld2);
        }

        ArrayList<String> form_dates = new ArrayList<>();


        for(int i=0 ; i< no_of_inputs; i++)
        {
            LocalDate signup = signup_ld.get(i);
            LocalDate current = current_ld.get(i);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate range_from;
            LocalDate range_to = current;
            if(signup.isAfter(current))
                form_dates.add("no range");
            else
            {
                int year = current.getYear();
                LocalDate temp = signup.withYear(year);
                range_from = temp.minusDays(30);
                if(!(temp.plusDays(30).isAfter(current)))
                    range_to = temp.plusDays(30);
                form_dates.add(formatter.format(range_from)+" "+formatter.format(range_to));
            }

        }

        for (int i=0;i<no_of_inputs;i++)
        {
            System.out.println(form_dates.get(i));
        }


    }
}

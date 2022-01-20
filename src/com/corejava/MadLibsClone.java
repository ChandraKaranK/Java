package com.corejava;

import java.util.Scanner;

public class MadLibsClone {

    public static void main(String []args)
    {
        String adjective;
        String girlName;
        String anotherAdjective;
        String occupation;
        String place;
        String clothing;
        String hobby;
        String otherAjdective;
        String otherOccupation;
        String boyName;
        String fatherName;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective:");
        adjective = sc.nextLine();

        System.out.print("Enter girl's name:");
        girlName = sc.nextLine();

        System.out.print("Enter another adjective:");
        anotherAdjective = sc.nextLine();

        System.out.print("Enter occupation:");
        occupation = sc.nextLine();

        System.out.print("Enter place name:");
        place = sc.nextLine();

        System.out.print("Enter a piece of clothing:");
        clothing = sc.nextLine();

        System.out.print("Enter a hobby:");
        hobby = sc.nextLine();

        System.out.print("Enter other adjective:");
        otherAjdective = sc.nextLine();

        System.out.print("Enter other ocuupation:");
        otherOccupation = sc.nextLine();

        System.out.print("Enter boy's name:");
        boyName = sc.nextLine();

        System.out.print("Enter girl's father name:");
        fatherName = sc.nextLine();
        System.out.println();

        System.out.print("There once was a "+adjective+"girl named "+girlName+" who was a "+anotherAdjective+" "+occupation+
        "in the kingdom of "+place+".She loved to wear "+clothing +" and to "+hobby+".She wanted to marry the "+otherAjdective+" "+otherOccupation+
        "named "+boyName+"but,her father "+fatherName+" forbid her from seeimg him.");

    }

}

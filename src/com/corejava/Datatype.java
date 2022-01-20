package com.corejava;

public class Datatype {

    public static void main(String args[])
    {
        int number = 20;
        char character = 'c';
        boolean flag = false;
        float  gpa = 8.27f;
        // float gpa = 8.27 gives error as real values are double by default.
        double cgpa = 8.27; // valid
        float gpa_f = (float)9.21; // typecasting
        double GPA = gpa;

        System.out.println("number:"+number);
        System.out.println("character:"+character);
        System.out.println("flag:"+flag);
        System.out.println("gpa:"+gpa);
        System.out.println("cgpa:"+cgpa);
        System.out.println("gpa float:"+gpa_f);
        System.out.println("GPA double:"+GPA);

    }
}

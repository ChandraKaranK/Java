package com.JavaAssignment.assignment12;

import java.util.ArrayList;

public class Student {

    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perTillDate;

    Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment ,double perTillDate)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.age = age;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    @Override
    public String toString()
    {
        return "Student Id: "+this.id
                +",Name: "+this.name
                + ",Age: "+this.age
                + ",Gender: "+this.gender
                + ",Department: "+this.engDepartment
                + ",Year of Enrollment: "+this.yearOfEnrollment
                +",Percentage: "+this.perTillDate;
    }


    String getName()
    {
        return this.name;
    }

    String getEngDepartment()
    {
        return this.engDepartment;
    }

    Double getPerecentage()
    {
        return this.perTillDate;
    }

    boolean isMale()
    {
        if(this.gender=="Male")
            return true;
        return false;
    }

    boolean isFemale()
    {
        if(this.gender=="Female")
            return true;
        return false;
    }

    String getGender()
    {
        return this.gender;
    }

    int getYearOfEnrollment()
    {
        return this.yearOfEnrollment;
    }

    int getAge()
    {
        return this.age;
    }



}

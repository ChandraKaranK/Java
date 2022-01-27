package com.JavaAssignment.assignment7.part3;

import java.awt.*;
import java.util.Scanner;

public class Employee extends OfficeData implements PersonalData{

    private String occupation;
    private String city;
    private int age;
    private String name;

    @Override
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String getOccupation() {
        return occupation;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    static void editOccupation(PersonalData personalData)
    {
        System.out.println("Enter the new occupation");
        Scanner sc = new Scanner(System.in);
        String occupation = sc.next();
        personalData.setOccupation(occupation);
        System.out.println("New occupation set as: "+personalData.getOccupation());
    }

    static void editName(Name name)
    {
        System.out.println("Enter the new name");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        name.setName(newName);
        System.out.println("New name set as: "+name.getName());
    }

    static void editAge(Age age)
    {
        System.out.println("Enter the new age");
        Scanner sc = new Scanner(System.in);
        int newAge = sc.nextInt();
        sc.nextLine();
        age.setAge(newAge);
        System.out.println("New age set as: "+age.getAge());
    }


    static void editAddress(Address address)
    {
        System.out.println("Enter the new city");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        address.setCity(city);
        System.out.println("New city set as: "+address.getCity());
    }


    public static void main(String args[])
    {
        Employee emp = new Employee();
        emp.editName(emp);
        emp.editAge(emp);
        emp.editAddress(emp);
        emp.editOccupation(emp);


    }
}

package com.corejava;

public class Strings {


    public static void main(String args[])
    {
            String name = "ChandraKaran";
            String surname = " Kethireddy";
            String fullname = name +surname;
            System.out.println(fullname);

            StringBuilder myName = new StringBuilder("ChandraKaran");
            String mySurname = " Kethireddy";
            myName.append(mySurname);
            System.out.println(myName.toString());


    }

}

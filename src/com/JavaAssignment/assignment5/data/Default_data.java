package com.JavaAssignment.assignment5.data;

public class Default_data {
    int number;
    char character;

    public void print_fields()
    {
        System.out.println("number is "+number);
        System.out.println("Character is "+character);
    }

    public void print_local_variables()
    {
        int local_number;
        char local_character;
        //System.out.println("local_number is"+local_number); // error
        //System.out.println("local_character is"+local_character);//error

        // Local variables are not initialized with default values as they are stored in stack.
        // Fields are initialized with default values during runtime.
    }

    public static void main(String args[])
    {
        Default_data d = new Default_data();
        d.print_fields();
    }

}

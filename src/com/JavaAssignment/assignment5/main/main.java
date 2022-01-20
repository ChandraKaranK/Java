package com.JavaAssignment.assignment5.main;
import com.JavaAssignment.assignment5.data.Default_data;
import com.JavaAssignment.assignment5.singleton.Singleton;

public class main {

    public static void main(String args[])
    {
        Default_data d = new Default_data();
        d.print_fields();
        d.print_local_variables(); // gives error
        Singleton s = new Singleton();
        s.print_name();

    }
}

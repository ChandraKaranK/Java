package com.JavaAssignment.assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class FileRegex {

    static final File homeDirectory = new File("C:\\Users\\DELL");

    static void printMatchedFiles(FilenameFilter filter)
    {
       File files[] = homeDirectory.listFiles(filter);
        for (File file:files)
        {
            System.out.println(file.getName());
        }
    }

    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        String quit = "no";

        while(quit.equals("no")){
            System.out.println("Enter the regular expression corresponding to the required files");
            String regex = sc.next();
            FilenameFilter filter = new FilenameFilter() {
               @Override
               public boolean accept(File homeDirectory, String name) {
                   return name.matches(regex);
               }
             };
            printMatchedFiles(filter);
            System.out.print("Do you want to quit(yes/no):");
            quit = sc.next();
        }

    }

}

package com.solidprinciples.validator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OracleValidator implements CardValidator {


    public boolean validateUser(int cardId)
    {
    boolean isValidUser = false;
    System.out.println("Enter the security pin");
    Scanner sc = new Scanner(System.in);
    int enteredPin = sc.nextInt();
    int actualPin;

        try{
       // Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        PreparedStatement stmt=con.prepareStatement("select atm_pin from users where card_id=?");
        stmt.setInt(1,cardId);
        ResultSet rs=stmt.executeQuery();

        if(rs.next()) {
            actualPin = rs.getInt(1);
            if (actualPin == enteredPin)
                isValidUser = true;
            else
                System.out.println("Remove your card and try with valid pin");
        }

        con.close();

    }catch(Exception e){ System.out.println(e);}

        return isValidUser;
}

    }


package com.solidprinciples.validator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MysqlValidator implements CardValidator {

    public boolean validateUser(int cardId)
    {
        System.out.println("Enter the security pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        int actualPin;
        boolean isValidTransaction = false;
        try{
            //Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","Password@123");

            PreparedStatement stmt=con.prepareStatement("select atm_pin from users where card_id=?");

            stmt.setInt(1,cardId);

            ResultSet rs=stmt.executeQuery();

            if(rs.next()) {
                actualPin = rs.getInt(1);
                System.out.println("actual pin is "+actualPin);

                if (actualPin == enteredPin)
                    isValidTransaction = true;
                else
                    System.out.println("Remove your card and try with valid pin");
            }

            con.close();

        }catch(Exception e){ System.out.println(e);}
        return isValidTransaction;

    }


}





package designpattern.factory;

import java.util.Scanner;

public class CustomerTypeFactory {

    public static CustomerType getCustomer()
    {
        System.out.println("Enter the customer type (i.e Normal,Pro,Elite):");
        Scanner sc = new Scanner(System.in);
        String customerType = sc.nextLine();
        String customer = customerType.toLowerCase();
        if(customer.equals("normal"))
            return new NormalCustomer();
        else if(customer.equals("pro"))
            return new ProCustomer();
        else if(customer.equals("elite"))
            return new EliteCustomer();
        return null;
    }

}

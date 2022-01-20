package designpattern.factory;

import java.util.Scanner;

public class CartGenerator {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount");
        int bill = sc.nextInt();
        CustomerType customer = CustomerTypeFactory.getCustomer();
        customer.setDeliveryCharge();
        customer.setDiscount();
        customer.printCartBill(bill);
    }

}

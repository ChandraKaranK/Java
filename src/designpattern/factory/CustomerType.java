package designpattern.factory;

public abstract class CustomerType{

    public double discount;
    public int deliveryCharge;

    abstract void setDiscount();
    abstract void setDeliveryCharge();

    void printCartBill(int bill)
    {
        System.out.println("Bill: "+bill);
        System.out.println("Delivery Charges: "+deliveryCharge);
        System.out.println("Discount on bill: "+discount*100+"%");
        System.out.println("Total Bill: "+((bill+deliveryCharge)*(1-discount)));
    }
}
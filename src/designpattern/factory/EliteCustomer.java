package designpattern.factory;

public class EliteCustomer extends CustomerType{

    @Override
    void setDiscount() {
        discount = 0.10;
    }

    @Override
    void setDeliveryCharge() {
        deliveryCharge = 0;
    }
}

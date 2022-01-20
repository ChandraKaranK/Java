package designpattern.factory;

public class ProCustomer extends CustomerType {

    @Override
    void setDiscount() {
        discount = 0.0;
    }

    @Override
    void setDeliveryCharge() {
        deliveryCharge = 0;
    }
}

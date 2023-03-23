package ParkingDesignPattern.Model.Payment;

import ParkingDesignPattern.Model.Person.Person;

public abstract  class Payment {
    Person person;
    double Price;
    PaymentCategory paymentCatogory ;

    public Payment(PaymentCategory paymentCategory){
        this.paymentCatogory = paymentCategory;
    }
}

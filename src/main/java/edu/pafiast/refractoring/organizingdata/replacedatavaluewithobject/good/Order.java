package edu.pafiast.refractoring.organizingdata.replacedatavaluewithobject.good;

public class Order {
    private Customer customer; // Replaced String with Customer object

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
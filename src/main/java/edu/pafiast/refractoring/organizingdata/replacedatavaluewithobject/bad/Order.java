package edu.pafiast.refractoring.organizingdata.replacedatavaluewithobject.bad;

public class Order {
    private String customerName; // Simple data value

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
/*
The customerName is just a string, but if you need to add more customer-related data
(e.g., email, address) or behavior (e.g., validation), it becomes cumbersome.
 */
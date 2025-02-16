package edu.pafiast.refractoring.organizingdata.replacedatavaluewithobject.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustOrderRunner {
    public static void main(String[] args) {
        // Usage
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        Order order = new Order(customer);
        log.info("Customer: " + order.getCustomer().getName());
        log.info("Email: " + order.getCustomer().getEmail());
    }
}

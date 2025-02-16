package edu.pafiast.refractoring.organizingdata.replacedatavaluewithobject.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderRunner {
    public static void main(String[] args) {
        // Usage
        Order order = new Order("John Doe");
        log.info("Customer: " + order.getCustomerName());
    }
}

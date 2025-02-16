package edu.pafiast.refractoring.extractingmethod.good;

import edu.pafiast.refractoring.extractingmethod.utils.Order;
import lombok.extern.slf4j.Slf4j;

/*
The printOrderSummary method was doing too much, so it was split into two smaller methods:
printOrderHeader and printOrderDetails.
 */

@Slf4j
public class OrderProcessor {
    public void printOrderSummary(Order order) {
        printOrderHeader(order);
        printOrderDetails(order);
    }

    private void printOrderHeader(Order order) {
        log.info("Order ID: " + order.getId());
        log.info("Customer: " + order.getCustomerName());
    }

    private void printOrderDetails(Order order) {
        log.info("Total Amount: " + order.getTotalAmount());
        log.info("Status: " + order.getStatus());
    }
}
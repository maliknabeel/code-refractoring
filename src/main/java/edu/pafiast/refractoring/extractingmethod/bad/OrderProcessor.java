package edu.pafiast.refractoring.extractingmethod.bad;

import edu.pafiast.refractoring.extractingmethod.utils.Order;

public class OrderProcessor {
    public void printOrderSummary(Order order) {
        System.out.println("Order ID: " + order.getId());
        System.out.println("Customer: " + order.getCustomerName());
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println("Status: " + order.getStatus());
    }
}

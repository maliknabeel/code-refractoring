package edu.pafiast.refractoring.movingfeaturesbetweenobjects.movemethod.good;

public class DiscountCalculator {
    public double calculateDiscount(Order order) {
        if (order.getTotalAmount() > 100) {
            return order.getTotalAmount() * 0.1;
        }
        return 0;
    }
}
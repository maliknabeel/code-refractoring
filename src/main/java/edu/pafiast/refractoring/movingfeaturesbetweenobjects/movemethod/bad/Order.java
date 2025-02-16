package edu.pafiast.refractoring.movingfeaturesbetweenobjects.movemethod.bad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String id;
    private double totalAmount;

    // getters and setters

    public double calculateDiscount() {
        if (totalAmount > 100) {
            return totalAmount * 0.1;
        }
        return 0;
    }
}

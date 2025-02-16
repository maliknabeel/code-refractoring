package edu.pafiast.refractoring.extractingmethod.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String id;
    private String customerName;
    private double totalAmount;
    private String status;
}

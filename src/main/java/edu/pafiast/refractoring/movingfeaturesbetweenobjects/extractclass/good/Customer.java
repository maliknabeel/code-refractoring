package edu.pafiast.refractoring.movingfeaturesbetweenobjects.extractclass.good;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;
    private Address address;

    // getters and setters
}
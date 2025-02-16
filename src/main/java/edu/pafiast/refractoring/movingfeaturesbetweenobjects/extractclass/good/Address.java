package edu.pafiast.refractoring.movingfeaturesbetweenobjects.extractclass.good;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // getters and setters
}

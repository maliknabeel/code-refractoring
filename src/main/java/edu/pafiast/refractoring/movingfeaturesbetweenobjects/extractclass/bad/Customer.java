
package edu.pafiast.refractoring.movingfeaturesbetweenobjects.extractclass.bad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // getters and setters
}

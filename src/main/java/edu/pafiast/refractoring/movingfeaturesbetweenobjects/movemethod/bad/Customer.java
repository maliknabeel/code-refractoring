package edu.pafiast.refractoring.movingfeaturesbetweenobjects.movemethod.bad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String name;
    private String email;

    // getters and setters

    public boolean isValidEmail() {
        return email != null && email.contains("@");
    }
}

package edu.pafiast.refractoring.movingfeaturesbetweenobjects.movemethod.good;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
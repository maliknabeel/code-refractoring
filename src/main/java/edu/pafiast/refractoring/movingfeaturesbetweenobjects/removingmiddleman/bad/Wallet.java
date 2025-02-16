package edu.pafiast.refractoring.movingfeaturesbetweenobjects.removingmiddleman.bad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallet {
    private double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

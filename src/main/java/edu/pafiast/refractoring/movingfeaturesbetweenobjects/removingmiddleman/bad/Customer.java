package edu.pafiast.refractoring.movingfeaturesbetweenobjects.removingmiddleman.bad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public double getBalance() {
        return wallet.getBalance();
    }
}

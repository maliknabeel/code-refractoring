package edu.pafiast.refractoring.movingfeaturesbetweenobjects.removingmiddleman.good;

public class Customer {
    private Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }
}

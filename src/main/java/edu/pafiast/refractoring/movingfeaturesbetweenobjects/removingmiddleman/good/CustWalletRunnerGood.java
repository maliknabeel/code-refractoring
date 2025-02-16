package edu.pafiast.refractoring.movingfeaturesbetweenobjects.removingmiddleman.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustWalletRunnerGood {
    public static void main(String[] args) {
        // Usage
        Customer customer = new Customer(new Wallet(120.0));
        double balance = customer.getWallet().getBalance(); // Directly access Wallet
        log.info("Balance: {}", balance);
    }
}

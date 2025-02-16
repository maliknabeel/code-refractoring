package edu.pafiast.refractoring.movingfeaturesbetweenobjects.removingmiddleman.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustWalletRunning {
    public static void main(String[] args) {
        // Usage
        Customer customer = new Customer(new Wallet(100.0));
        double balance = customer.getBalance(); // Middleman: Customer delegates to Wallet
        log.info("Balance: {}", balance);
    }
}

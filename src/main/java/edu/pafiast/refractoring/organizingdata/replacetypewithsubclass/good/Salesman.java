package edu.pafiast.refractoring.organizingdata.replacetypewithsubclass.good;

public class Salesman extends Employee {
    @Override
    public double calculateBonus() {
        return 1000;
    }

    @Override
    public void performDuties() {
        System.out.println("Selling products...");
    }
}

package edu.pafiast.refractoring.organizingdata.replacetypewithsubclass.good;

public class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return 2000;
    }

    @Override
    public void performDuties() {
        System.out.println("Managing team...");
    }
}

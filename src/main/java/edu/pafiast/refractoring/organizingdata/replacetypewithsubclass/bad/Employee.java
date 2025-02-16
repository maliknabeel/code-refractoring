package edu.pafiast.refractoring.organizingdata.replacetypewithsubclass.bad;

public class Employee {
    public static final int ENGINEER = 0;
    public static final int MANAGER = 1;
    public static final int SALESMAN = 2;

    private int employeeType;

    public Employee(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public double calculateBonus() {
        switch (employeeType) {
            case ENGINEER:
                return 1000;
            case MANAGER:
                return 2000;
            case SALESMAN:
                return 1500;
            default:
                throw new IllegalArgumentException("Invalid employee type");
        }
    }

    public void performDuties() {
        switch (employeeType) {
            case ENGINEER:
                System.out.println("Writing code...");
                break;
            case MANAGER:
                System.out.println("Managing team...");
                break;
            case SALESMAN:
                System.out.println("Selling products...");
                break;
            default:
                throw new IllegalArgumentException("Invalid employee type");
        }
    }
}

/*
    1- Conditional Logic: The class uses switch statements to handle behavior based on the type code,
    which makes the code harder to maintain and extend.

    2 - Violation of Open/Closed Principle: Adding a new type requires modifying the existing class,
    which violates the Open/Closed Principle (classes should be open for extension but closed for modification).
 */
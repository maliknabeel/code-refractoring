package edu.pafiast.refractoring.organizingdata.replacetypewithsubclass.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeeRunnerGood {
    public static void main(String[] args) {
        // Usage
        Employee engineer = new Engineer();
        log.info("Engineer Bonus: " + engineer.calculateBonus());
        engineer.performDuties();

        Employee manager = new Manager();
        log.info("Manager Bonus: " + manager.calculateBonus());
        manager.performDuties();
    }
}

/*
   1- Polymorphism: The Employee class is now abstract, and the type-specific behavior is
    implemented in the subclasses (Engineer, Manager, Salesman).

   2- Elimination of Conditional Logic: The switch statements are removed,
    and the behavior is determined by the subclass.

   3- Extensibility: Adding a new type (e.g., Director) only requires creating a
    new subclass without modifying the existing code.
 */
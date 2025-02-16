package edu.pafiast.refractoring.organizingdata.replacetypewithsubclass.bad;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmplaoyeeRunnerBad {
    public static void main(String[] args) {
        // Usage
        Employee engineer = new Employee(Employee.ENGINEER);
        log.info("Engineer Bonus: " + engineer.calculateBonus());
        engineer.performDuties();

        Employee manager = new Employee(Employee.MANAGER);
        log.info("Manager Bonus: " + manager.calculateBonus());
        manager.performDuties();
    }
}

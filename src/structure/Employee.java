package structure;

import java.math.BigDecimal;

public class Employee {

    private final String name;

    private final Manager manager;

    private final BigDecimal salary;

    public Employee(String name, Manager manager, BigDecimal salary) {
        this.name = name;
        this.manager = manager;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public BigDecimal getTotalSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

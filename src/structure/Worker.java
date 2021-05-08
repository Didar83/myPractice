package structure;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Worker extends Employee {

    private final BigDecimal bonus;

    private final LocalDate employmentDate;


    public Worker(String name, Manager manager, BigDecimal salary,
                  BigDecimal bonus, LocalDate employmentDate) {
        super(name, manager, salary);
        this.bonus = bonus;
        this.employmentDate = employmentDate;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    @Override
    public BigDecimal getTotalSalary() {
        return super.getTotalSalary().add(getBonus());
    }
}

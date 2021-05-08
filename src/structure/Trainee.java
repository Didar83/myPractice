package structure;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Trainee extends Employee {

    private final LocalDate startDate;

    private final int days;

    public Trainee(String name, Manager manager, BigDecimal salary,
                   LocalDate startDate, int days) {
        super(name, manager, salary);
        this.startDate = startDate;
        this.days = days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getDays() {
        return days;
    }
}

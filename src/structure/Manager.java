package structure;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Manager extends Worker {

    private final List<Employee> employees;

    public Manager(String name, Manager manager, BigDecimal salary,
                   BigDecimal bonus, LocalDate employmentDate, List<Employee> employees) {
        super(name, manager, salary, bonus, employmentDate);
        this.employees = employees;
    }

    public BigDecimal getAverageSalary() {
        if (getEmployees().isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal sum = BigDecimal.ZERO;
        int empCount = 0;
        for (Employee emp : getEmployees()) {
            if (emp instanceof Manager) {
                continue;
            }
            empCount++;
            sum = sum.add(emp.getTotalSalary());
        }
        return sum.divide(BigDecimal.valueOf(empCount), 2, RoundingMode.HALF_UP);
    }

    public Employee getMaxSalaryEmployee() {
        //
        Employee richestEmp = null;
        for (Employee emp : employees) {
            if (richestEmp == null) {
                richestEmp = emp;
            } else if (richestEmp.getTotalSalary().compareTo(emp.getTotalSalary()) < 0) {
                richestEmp = emp;
            }
        }
        return richestEmp;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = new ArrayList<>();
        for (Employee emp : getEmployees()) {
            allEmployees.add(emp);
            if (emp instanceof Manager) {
                for (Employee emp2 : ((Manager) emp).getAllEmployees()) {
                    allEmployees.add(emp2);
                }
            }
        }
        return allEmployees;
    }

    @Override
    public BigDecimal getTotalSalary() {
        BigDecimal extraBonus = super.getTotalSalary().multiply(BigDecimal.valueOf(0.15));
        return super.getTotalSalary().add(extraBonus);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}


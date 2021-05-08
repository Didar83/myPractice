package structure;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Structure {

    public static void main(String[] args) {
        // Manager
        // - Manager
        // - Worker
        // - Trainee
        List<Employee> employees = new ArrayList<Employee>();
        List<Employee> employees2 = new ArrayList<Employee>();
        Manager topManager = new Manager("topManager", null, new BigDecimal(100000), new BigDecimal(100000), LocalDate.of(2018, 1, 1), employees);
        Employee manager1 = new Manager("manager1", topManager, new BigDecimal(10000), new BigDecimal(10000), LocalDate.of(2019, 1, 1), employees2);
        Employee worker1 = new Worker("worker1", topManager, new BigDecimal(1000), new BigDecimal(1000), LocalDate.of(2020, 1, 1));
        Employee worker2 = new Worker("worker2", topManager, new BigDecimal(1000), new BigDecimal(1000), LocalDate.of(2020, 1, 1));
        Employee worker3 = new Worker("worker3", topManager, new BigDecimal(1000), new BigDecimal(1000), LocalDate.of(2020, 1, 1));
        Employee worker4 = new Worker("worker4", topManager, new BigDecimal(1000), new BigDecimal(1000), LocalDate.of(2020, 1, 1));
        Employee trainee1 = new Trainee("trainee1", topManager, BigDecimal.ZERO, LocalDate.of(2021, 5, 10), 90);
        employees.add(manager1);
        employees.add(worker1);
        employees.add(trainee1);
        employees2.add(worker2);
        employees2.add(worker3);
        employees2.add(worker4);
//        BigDecimal result = topManager.getAverageSalary();
//        System.out.println(result);
//
//        System.out.println(topManager.getTotalSalary());
//
//        System.out.println(topManager.getMaxSalaryEmployee().getName());
        System.out.println(topManager.getAllEmployees());
        /*
        BigDecimal num1 = new BigDecimal(170);
        BigDecimal num2 = new BigDecimal(55);
        BigDecimal res = num1.add(num2);
        System.out.println(res);
        */
    }
}

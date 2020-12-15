package week03d02;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(Position.CEO.name(), Position.CEO.getBonus()));
        employees.add(new Employee(Position.MANAGER.name(), Position.MANAGER.getBonus()));
        employees.add(new Employee(Position.CFO.name(),Position.CFO.getBonus()));

        for (Employee employee: employees) {
            if (employee.getBonus() > 150_000){
                System.out.println(employee.toString());
            }
        }
    }
}

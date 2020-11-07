package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1991, 02, 25, "Kissné Nagy Erika");

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());

        employee.setName("Nagy Erika");

        System.out.println("A dolgozó új neve: " + employee.getName());
    }
}

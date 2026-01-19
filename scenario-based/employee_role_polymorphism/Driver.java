package employee_role_polymorphism;

import java.util.Scanner;

import employee_role_polymorphism.impl.Developer;
import employee_role_polymorphism.impl.Employee;
import employee_role_polymorphism.impl.Manager;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Role: ");
        String role = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee employee;

        if ("manager".equalsIgnoreCase(role)) {
            employee = new Manager(name, salary);
        } else {
            employee = new Developer(name, salary);
        }

        System.out.printf("%.2f%n", employee.getBonus());
        sc.close();
    }
}

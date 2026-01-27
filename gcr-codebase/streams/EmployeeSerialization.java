package streams;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        String file = "employees.ser";

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 50000),
                new Employee(2, "B", "HR", 45000)
        );

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            list.forEach(e ->
                    System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import java.util.ArrayList;
import java.util.List;

interface Department {
    void assignDepartment(String department);

    String getDepartmentDetails();
}

abstract class EmployeeDemoOOPS implements Department {
    @SuppressWarnings("FieldMayBeFinal")
    private int employeeId;
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private double baseSalary;
    private String department;

    protected EmployeeDemoOOPS(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    protected double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(
                "ID: " + employeeId +
                        ", Name: " + name +
                        ", Department: " + department +
                        ", Salary: " + calculateSalary());
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

class FullTimeEmployee extends EmployeeDemoOOPS {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends EmployeeDemoOOPS {
    @SuppressWarnings("FieldMayBeFinal")
    private int hoursWorked;
    @SuppressWarnings("FieldMayBeFinal")
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<EmployeeDemoOOPS> employees = new ArrayList<>();

        EmployeeDemoOOPS e1 = new FullTimeEmployee(1, "Alice", 60000);
        EmployeeDemoOOPS e2 = new PartTimeEmployee(2, "Bob", 120, 300);

        e1.assignDepartment("Engineering");
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        employees.forEach(EmployeeDemoOOPS::displayDetails);
    }
}

public class EmployeeDemo {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("EmployeeDemo Name: " + name);
        System.out.println("EmployeeDemo id: " + id);
        System.out.println("EmployeeDemo Salary: " + salary);
    }

    public static void main(String[] args) {
        EmployeeDemo emp = new EmployeeDemo();
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000;

        emp.displayDetails();
    }
}

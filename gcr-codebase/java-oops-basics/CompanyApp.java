public class CompanyApp {

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 501;
        m.department = "Engineering";
        m.setSalary(90000);

        m.display();
        System.out.println("Employee ID: " + m.employeeID + "'s Salary: " + m.getSalary());
    }

    static class Employee {
        public int employeeID;
        protected String department;
        private double salary;

        public void setSalary(double s) {
            salary = s;
            System.out.println("Salary set to: " + salary + " for employee ID: " + employeeID);
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Manager extends Employee {
        void display() {
            System.out.println("Employee ID: " + employeeID + " Department: " + department);
        }
    }
}

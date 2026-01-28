package employee_lms.impl;

import java.util.HashMap;
import java.util.Map;

public class EmployeeList {

    private static final Map<Integer, Employee> employees = new HashMap<>();

    public static Map<Integer, Employee> getAllEmployees() {
        return employees;
    }

    public static void addEmp(int id, String name, String role){
        Employee emp = new Employee(id, name, role);
        getAllEmployees().put(emp.getId(), emp);
        System.out.println("[System] Employee Added Successfully");
    }

    public static Employee getEmp(int id){
        Employee emp = getAllEmployees().get(id);
        if (emp == null) {
            System.out.print("[Exception Thrown] "); throw new EmployeeNotFoundException();
        }
        return emp;
    }

    public static void deductLeaveBalance(int id){
        getEmp(id).decrementLeaveBalance();
    }

    public static void addLeaveBalance(int id){
        getEmp(id).incrementLeaveBalance();
    }

    public static void displayEmployee(int id){

        System.out.println(
                        "------------------------------------------\n" +
                        "Employee Name: " + getEmp(id).getName() + "\n" +
                        "Employee Role: " + getEmp(id).getRole() + "\n" +
                        "Employee Leave Balance: " + getEmp(id).getLeaveBalance() + "\n" +
                        "------------------------------------------"

        );
    }
}
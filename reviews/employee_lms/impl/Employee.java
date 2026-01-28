package employee_lms.impl;

public class Employee {
    public static final int LEAVE_BALANCE_INIT = 2; //default leave balance

    private int id;
    private String name;
    private String role;
    private int leaveBalance;

    public Employee(int id, String name, String role){
        this.id = id;
        this.name = name;
        this.role = role;
        this.leaveBalance = LEAVE_BALANCE_INIT;
    }

    public Employee(Employee emp){
        this.id = emp.id;
        this.name = emp.name;
        this.role = emp.role;
        this.leaveBalance = emp.leaveBalance;
    }

    public int getId() {
        return id;
    }
    public String getName() { return name; }
    public String getRole() {
        return role;
    }
    public int getLeaveBalance() {
        return leaveBalance;
    }
    public void decrementLeaveBalance(){
        this.leaveBalance--;
    }
    public void incrementLeaveBalance(){
        this.leaveBalance++;
    }
}
package employee_lms.impl;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(){
        super("[System Error] Insufficient Leave Balance");
    }
}
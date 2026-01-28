package employee_lms.impl;

public class InsufficientLeaveBalanceException extends RuntimeException{
    public InsufficientLeaveBalanceException(){
        super("[System Error] Insufficient Leave Balance");
    }
}
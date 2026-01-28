package employee_lms.impl;

public class LeaveRequest {
    private int leaveDays;
    private Employee emp;
    private String reason;
    private boolean isApproved;

    public LeaveRequest(Employee emp, int leaveDays, String reason){
        this.emp = emp;
        this.leaveDays = leaveDays;
        this.reason = reason;
        this.isApproved = false;
    }

    public LeaveRequest(LeaveRequest lr){
        this.emp = lr.emp;
        this.leaveDays = lr.leaveDays;
        this.reason = lr.reason;
        this.isApproved = lr.isApproved;
    }

    public int getLeaveDays() { return leaveDays; }
    public Employee getEmp() {
        return emp;
    }
    public String getReason() {
        return reason;
    }
    public boolean getIsApproved() {
        return isApproved;
    }

    public void setApproved() {
        isApproved = true;
        System.out.println("[System] Leave Approved Successfully");
    }
    public void unsetApproved(){
        isApproved = false;
        System.out.println("[System] Leave Un-Approved Successfully");
    }
}
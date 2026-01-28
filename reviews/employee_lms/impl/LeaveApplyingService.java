package employee_lms.impl;

import static employee_lms.impl.EmployeeList.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaveApplyingService {

    private static final List<LeaveRequest> leaveReqList = new ArrayList<>();
    public static List<LeaveRequest> getLeaveRequestList(){
        return leaveReqList;
    }

    public static void applyLeave(int id, int days, String reason) {
        try {
            if(getEmp(id).getLeaveBalance()<=0){
                throw new InsufficientLeaveBalanceException();
            }
            LeaveRequest ls = new LeaveRequest(getEmp(id), days, reason);
            getLeaveRequestList().add(ls);
            deductLeaveBalance(id);
            System.out.println("[System] Leave Applied Successfully...");
        } catch (InsufficientLeaveBalanceException | EmployeeNotFoundException e){
            System.out.println("[Caught Exception] " + e);
        } catch (Exception e){
            System.out.println("[Caught System Error] " + e);
        }
    }

    public static void displayLeaves(){
        if(getLeaveRequestList().isEmpty()){
            System.out.println("[System] No Leave Requests");
            return;
        }
        System.out.println("---------------------All leave Requests-----------------------\n");
        for(int i=0; i<getLeaveRequestList().size(); i++){
            LeaveRequest l = getLeaveRequestList().get(i);
            System.out.println(
                            "Index: " + i + "\n" +
                            "Employee Name: " + l.getEmp().getName() + "\n" +
                            "Employee's Leave Balance: " + l.getEmp().getLeaveBalance() + "\n" +
                            "Employee ID: " + l.getEmp().getId() + ", Role: " + l.getEmp().getRole() + "\n" +
                            "Leave Days: " + l.getLeaveDays() + " Days, Reason: " + l.getReason() + "\n" +
                            "Is Leave Approved: " + l.getIsApproved() + "\n"
            );

        }
        System.out.println("--------------------------------------------------------------");

    }

    public static void displayPendingLeaves() {
        if (getLeaveRequestList().isEmpty()) {
            System.out.println("[System] No Leave Requests");
            return;
        }
        boolean hasPending = false;
        System.out.println("------------------ Pending Leave Requests --------------------\n");
        for (int i = 0; i < getLeaveRequestList().size(); i++) {

            if (!getLeaveRequestList().get(i).getIsApproved()) {
                hasPending = true;

                LeaveRequest l = getLeaveRequestList().get(i);

                System.out.println(
                                "Index: " + i + "\n" +
                                "Employee Name: " + l.getEmp().getName() + "\n" +
                                "Employee's Leave Balance: " + l.getEmp().getLeaveBalance() + "\n" +
                                "Employee ID: " + l.getEmp().getId() + ", Role: " + l.getEmp().getRole() + "\n" +
                                "Leave Days: " + l.getLeaveDays() + " Days, Reason: " + l.getReason() + "\n" +
                                "Is Leave Approved: " + l.getIsApproved() + "\n"
                );
            }
        }
        if (!hasPending) {
            System.out.println("[System] No Pending Leave Requests");
        }
        System.out.println("--------------------------------------------------------------");
    }

    // Approve Leaves
    public static void approveLeave(int idx){
        if (idx < 0 || idx >= getLeaveRequestList().size()) {
            System.out.println("[System Error] Invalid Leave Index");
            return;
        }

        if(getLeaveRequestList().get(idx).getIsApproved()){
            System.out.println("[System] Leave Already Approved");
            return;
        }
        getLeaveRequestList().get(idx).setApproved();
    }
    // Un-Approval of Leave
    public static void disapproveLeave(int idx){
        if (idx < 0 || idx >= getLeaveRequestList().size()) {
            System.out.println("[System Error] Invalid Leave Index");
            return;
        }

        if(!getLeaveRequestList().get(idx).getIsApproved()){
            System.out.println("[System] Leave Not Approved Yet");
            return;
        }
        getLeaveRequestList().get(idx).unsetApproved();
    }

    // Rejection of Leave
    public static void rejectLeave(int idx, Scanner sc) {
        if (idx < 0 || idx >= getLeaveRequestList().size()) {
            System.out.println("[System Error] Invalid Leave Index");
            return;
        }

        if (getLeaveRequestList().get(idx).getIsApproved()) {
            System.out.println(
                    "[System] Rejection of Approved Leave Not Allowed.\n" +
                            "Would you like to Un-Approve and Reject the Leave Request Together?"
            );
            System.out.print("[System] Enter (Yes/No): ");
            sc.nextLine(); // consume leftover newline if any
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                disapproveLeave(idx);
                addLeaveBalance(getLeaveRequestList().get(idx).getEmp().getId());
                getLeaveRequestList().remove(idx);
                System.out.println("[System] Leave Un-Approved and Rejected Successfully");
            }
            return;
        }

        addLeaveBalance(getLeaveRequestList().get(idx).getEmp().getId());
        getLeaveRequestList().remove(idx);
        System.out.println("[System] Leave Rejected Successfully");
    }


}
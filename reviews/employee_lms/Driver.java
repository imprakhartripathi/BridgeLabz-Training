package employee_lms;

import java.util.Scanner;

import static employee_lms.impl.EmployeeList.*;
import static employee_lms.impl.LeaveApplyingService.*;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Leave Management System\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ----------------------------------
                Menu:
                1. Add Employee
                2. Get Employee by ID
                3. Apply for Leave
                4. Display All Leave Requests
                5. Display Pending Leave Requests
                6. Approve by Index
                7. Reject by Index
                8. Un-Approve Leave by Index
                0. Exit
                ----------------------------------
                """);

        while(true){
            System.out.print("\nEnter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0 -> {
                    System.out.println("Exiting Employee Leave Management System");
                    sc.close();
                    return;
                }
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();

                    addEmp(id, name, role);
                }

                case 2 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    displayEmployee(id);
                }
                case 3 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Days: ");
                    int days = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Reason: ");
                    String reason = sc.nextLine();

                    applyLeave(id, days, reason);
                }
                case 4 -> {
                    displayLeaves();
                }
                case 5 -> {
                    displayPendingLeaves();
                }
                case 6 ->{
                    System.out.print("Enter Index: ");
                    approveLeave(sc.nextInt());
                }
                case 7 -> {
                    System.out.print("Enter Index: ");
                    rejectLeave(sc.nextInt(), sc);

                }
                case 8 -> {
                    System.out.print("Enter Index: ");
                    disapproveLeave(sc.nextInt());
                }
                default -> {
                    System.out.println("Wrong Choice");
                }
            }
        }

    }
}
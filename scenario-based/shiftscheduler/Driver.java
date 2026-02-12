package shiftscheduler;

import shiftscheduler.impl.*;

public class Driver {
    public static void main(String[] args) {

        ShiftService service = new ShiftService();

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(2, "Aman");

        try {
            service.assignShift(ShiftTime.MORNING, e1);
            service.assignShift(ShiftTime.AFTERNOON, e2);
            service.assignShift(ShiftTime.NIGHT, e2);

            // Duplicate assignment
            service.assignShift(ShiftTime.MORNING, e1);

        } catch (ShiftAlreadyAssignedException e) {
            System.out.println(e.getMessage());
        }

        service.printShiftAssignments();
    }
}

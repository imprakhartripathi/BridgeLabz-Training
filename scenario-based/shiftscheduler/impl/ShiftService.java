package shiftscheduler.impl;

import java.util.*;

public class ShiftService {

    private List<Employee> employeeList = new ArrayList<>();
    private Map<ShiftTime, List<Employee>> shiftMap = new HashMap<>();

    public void assignShift(ShiftTime shift, Employee employee)
            throws ShiftAlreadyAssignedException {

        shiftMap.putIfAbsent(shift, new ArrayList<>());

        List<Employee> employees = shiftMap.get(shift);

        for (Employee e : employees) {
            if (e.getId() == employee.getId()) {
                throw new ShiftAlreadyAssignedException(
                        "Error: Employee " + employee.getName()
                                + " already assigned to "
                                + shift + " shift");
            }
        }

        employees.add(employee);
        employeeList.add(employee);

        System.out.println("Success: " + employee.getName()
                + " assigned to " + shift + " shift.");
    }

    public void printShiftAssignments() {

        for (Map.Entry<ShiftTime, List<Employee>> entry : shiftMap.entrySet()) {

            System.out.println("Shift: " + entry.getKey());

            for (Employee e : entry.getValue()) {
                System.out.println("  - " + e.getName());
            }
        }
    }
}

package shiftscheduler.impl;

public class ShiftAlreadyAssignedException extends Exception {

    public ShiftAlreadyAssignedException(String message) {
        super(message);
    }
}

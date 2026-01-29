package restaurant.exception;

public class TableAlreadyReservedException extends Exception {
    public TableAlreadyReservedException(int tableNumber,  String timeSlot) {
        super("[System Error] Table " + tableNumber + " already reserved at " + timeSlot);
    }
}

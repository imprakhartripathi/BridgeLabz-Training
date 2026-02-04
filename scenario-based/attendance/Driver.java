package attendance;

public class Driver {
    public static void main(String[] args) {

        AttendanceService service = new AttendanceService();

        try {
            service.markAttendance("S1", "STU101");
            service.markAttendance("S1", "STU102");
            service.markAttendance("S1", "STU101"); // duplicate
        } catch (DuplicateAttendanceException e) {
            System.out.println(e.getMessage());
        }

        service.displayAttendance("S1");
    }
}

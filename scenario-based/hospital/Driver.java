package hospital;

import hospital.impl.*;

public class Driver {
    public static void main(String[] args) {
        Patient p = new Patient(1, "Amit", "2 heart attacks");
        Doctor d = new Doctor(101, "Dr Sharma", "Cardio");

        HospitalService service = new HospitalServiceImpl();

        try {
            Appointment ap = service.bookAppointment(p, d);
            ap.showDetails();
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

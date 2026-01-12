package hospital.impl;

public interface HospitalService {
    Appointment bookAppointment(Patient p, Doctor d)
            throws AppointmentNotAvailableException;
}

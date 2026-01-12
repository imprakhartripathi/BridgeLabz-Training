package hospital.impl;

public class HospitalServiceImpl implements HospitalService {
    public Appointment bookAppointment(Patient p, Doctor d)
            throws AppointmentNotAvailableException {
        if (d == null)
            throw new AppointmentNotAvailableException("Doctor not available");
        return new Appointment(p, d);
    }
}

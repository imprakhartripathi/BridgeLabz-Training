package onlinedoctor.model;

public class Appointment {

    private String patientName;
    private Doctor doctor;
    private String slot;

    public Appointment(String patientName, Doctor doctor, String slot) {
        this.patientName = patientName;
        this.doctor = doctor;
        this.slot = slot;
    }

    public String toString() {
        return "Patient: " + patientName +
                ", Doctor: " + doctor.getName() +
                ", Slot: " + slot;
    }
}
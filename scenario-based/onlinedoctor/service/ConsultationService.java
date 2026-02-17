package onlinedoctor.service;

import onlinedoctor.exp.SlotUnavailableException;
import onlinedoctor.model.Appointment;
import onlinedoctor.model.Doctor;

import java.util.*;

public class ConsultationService {

    private Map<String, List<Doctor>> doctorMap = new HashMap<>();
    private List<Appointment> consultationHistory = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctorMap
                .computeIfAbsent(doctor.getSpecialization(), k -> new ArrayList<>())
                .add(doctor);
    }

    public void bookAppointment(String patientName,
                                String specialization,
                                String slot)
            throws SlotUnavailableException {

        List<Doctor> doctors = doctorMap.get(specialization);

        if (doctors == null || doctors.isEmpty()) {
            throw new SlotUnavailableException("No doctors available for specialization.");
        }

        for (Doctor doctor : doctors) {
            if (doctor.isSlotAvailable(slot)) {
                doctor.bookSlot(slot);
                Appointment appointment =
                        new Appointment(patientName, doctor, slot);
                consultationHistory.add(appointment);
                System.out.println("Appointment booked successfully.");
                return;
            }
        }

        throw new SlotUnavailableException("Requested slot unavailable.");
    }

    public void displayHistory() {
        System.out.println("=== Consultation History ===");
        consultationHistory.forEach(System.out::println);
    }
}
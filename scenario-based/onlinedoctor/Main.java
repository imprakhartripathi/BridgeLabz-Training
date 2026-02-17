package onlinedoctor;

import onlinedoctor.exp.SlotUnavailableException;
import onlinedoctor.model.Doctor;
import onlinedoctor.service.ConsultationService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ConsultationService service = new ConsultationService();

        service.addDoctor(new Doctor("Dr. Mehta", "Cardiology",
                Arrays.asList("10AM", "11AM")));

        service.addDoctor(new Doctor("Dr. Rao", "Dermatology",
                Arrays.asList("12PM", "1PM")));

        try {
            service.bookAppointment("Aman", "Cardiology", "10AM");
            service.bookAppointment("Riya", "Cardiology", "10AM"); // double booking
        } catch (SlotUnavailableException e) {
            System.out.println(e.getMessage());
        }

        service.displayHistory();
    }
}
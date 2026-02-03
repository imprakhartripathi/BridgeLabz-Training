package streamapi;

import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
}

public class DoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedics", true)
        );

        doctors.stream()
                .filter(d -> d.availableOnWeekend)
                .sorted(Comparator.comparing(d -> d.specialty))
                .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}

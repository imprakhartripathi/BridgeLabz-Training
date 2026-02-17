package onlinedoctor.model;

import java.util.*;

public class Doctor {

    private String name;
    private String specialization;
    private List<String> availableSlots = new ArrayList<>();

    public Doctor(String name, String specialization, List<String> slots) {
        this.name = name;
        this.specialization = specialization;
        this.availableSlots.addAll(slots);
    }

    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    public boolean isSlotAvailable(String slot) {
        return availableSlots.contains(slot);
    }

    public void bookSlot(String slot) {
        availableSlots.remove(slot);
    }
}
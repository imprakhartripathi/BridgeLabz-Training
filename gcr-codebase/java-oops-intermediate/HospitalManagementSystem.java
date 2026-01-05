@SuppressWarnings("unused")
interface MedicalRecord {
    void addRecord(String record);

    void viewRecords();
}

abstract class Patient {
    @SuppressWarnings({"unused", "FieldMayBeFinal"})
    private int patientId;
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private int age;

    protected Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + ", Age: " + age);
    }
}

class InPatient extends Patient {
    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() {
        return 5000;
    }
}

@SuppressWarnings("unused")
class OutPatient extends Patient {
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() {
        return 500;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "Raj", 40);
        System.out.println(p.calculateBill());
    }
}

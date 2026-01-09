package hospital.impl;

public abstract class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public abstract void displayInfo();
}

package hospital.impl;

import java.util.Random;

public class Doctor extends Person {
    private String specialization;
    private static final Random random = new Random();

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public int calculateFee() {
        // Fee between 500 and 1500 (inclusive)
        return 500 + random.nextInt(1001);
    }
}

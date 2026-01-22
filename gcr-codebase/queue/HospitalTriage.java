package queue;

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> b.severity - a.severity);

        pq.add(new Patient("James Gosling", 5));
        pq.add(new Patient("Linus Torvalds", 3));
        pq.add(new Patient("Dennis Richie", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }
}

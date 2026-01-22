package insurance_set_based.impl;

import java.time.LocalDate;
import java.util.*;

public class PerformanceTest {

    public static void test(Set<Policy> set, String label) {

        long start = System.nanoTime();

        for (int i = 0; i < 10_000; i++) {
            set.add(new Policy(
                    "P" + i,
                    "User" + i,
                    LocalDate.now().plusDays(i % 365),
                    "Health",
                    1000
            ));
        }

        set.contains(new Policy("P5000", "", LocalDate.now(), "", 0));
        set.remove(new Policy("P4000", "", LocalDate.now(), "", 0));

        long end = System.nanoTime();

        System.out.println(label + " time: " + (end - start));
    }
}

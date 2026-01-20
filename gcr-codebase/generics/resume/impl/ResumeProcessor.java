package generics.resume.impl;

import java.util.List;

public class ResumeProcessor {
    public static void process(List<? extends Resume<? extends JobRole>> list) {
        for (Resume<? extends JobRole> r : list)
            System.out.println("Screening: " + r.role.getRole());
    }
}

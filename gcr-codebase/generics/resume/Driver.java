package generics.resume;

import generics.resume.impl.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();

        resumes.add(new Resume<>(new SoftwareEngineer()));
        resumes.add(new Resume<>(new DataScientist()));

        ResumeProcessor.process(resumes);
    }
}

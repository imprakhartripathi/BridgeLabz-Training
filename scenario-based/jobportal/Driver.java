package jobportal;

import jobportal.resume.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

        List<Resume> resumes = new ArrayList<>();

        resumes.add(new Resume("Alice", Set.of("Java", "Spring", "SQL")));
        resumes.add(new Resume("Bob", Set.of("Java", "React")));
        resumes.add(new Resume("Charlie", Set.of("Python", "ML")));

        Set<String> requiredSkills = Set.of("SQL");

        ResumeService service = new ResumeService();
        List<Resume> shortlisted = service.shortlist(resumes, requiredSkills);

        shortlisted.forEach(r ->
                System.out.println(r.getCandidateName() + " - " + r.getSkills())
        );
    }
}

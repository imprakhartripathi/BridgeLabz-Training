package jobportal.resume;

import java.util.*;

public class ResumeService {

    public List<Resume> shortlist(List<Resume> resumes, Set<String> requiredSkills) {

        return resumes.stream()
                .filter(r -> countMatches(r.getSkills(), requiredSkills) > 0)
                .sorted(Comparator.comparingInt(
                        (Resume r) -> countMatches(r.getSkills(), requiredSkills)
                ).reversed())
                .toList();
    }


    private int countMatches(Set<String> resumeSkills, Set<String> requiredSkills) {
        int count = 0;
        for (String skill : requiredSkills) {
            if (resumeSkills.contains(skill)) {
                count++;
            }
        }
        return count;
    }
}

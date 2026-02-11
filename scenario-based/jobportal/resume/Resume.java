package jobportal.resume;

import java.util.Set;

public class Resume {
    private String candidateName;
    private Set<String> skills;

    public Resume(String candidateName, Set<String> skills) {
        if (skills == null || skills.isEmpty()) {
            throw new InvalidResumeException("Resume must contain at least one skill");
        }
        this.candidateName = candidateName;
        this.skills = skills;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public Set<String> getSkills() {
        return skills;
    }
}

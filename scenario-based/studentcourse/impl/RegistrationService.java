package studentcourse.impl;

public abstract class RegistrationService {
    public abstract void register(Student student, Course course)
            throws CourseLimitExceededException;
}

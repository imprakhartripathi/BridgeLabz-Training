package studentcourse.impl;

public class CourseRegistrationService extends RegistrationService {
    public void register(Student student, Course course)
            throws CourseLimitExceededException {
        student.enroll(course);
    }
}

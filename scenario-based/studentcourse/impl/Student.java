package studentcourse.impl;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> courses = new ArrayList<>();
    private static final int MAX_COURSES = 3;

    public Student(String name) {
        super(name);
    }

    public void enroll(Course course) throws CourseLimitExceededException {
        if (courses.size() >= MAX_COURSES)
            throw new CourseLimitExceededException("Max course limit reached");
        courses.add(course);
    }

    public void showCourses() {
        for (Course c : courses)
            System.out.println(c.getName());
    }
}

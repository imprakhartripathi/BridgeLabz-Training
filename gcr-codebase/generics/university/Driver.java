package generics.university;

import generics.university.impl.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<Course<? extends CourseType>> courses = new ArrayList<>();

        courses.add(new Course<>(new ExamCourse()));
        courses.add(new Course<>(new ResearchCourse()));

        Course.displayCourses(courses);
    }
}

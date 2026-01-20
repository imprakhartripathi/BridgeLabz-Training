package generics.university.impl;

import java.util.List;

public class Course<T extends CourseType> {
    private T type;

    public Course(T type) { this.type = type; }

    public static void displayCourses(List<? extends Course<? extends CourseType>> list) {
        for (Course<?> c : list)
            System.out.println(c.type.getEvaluation());
    }
}

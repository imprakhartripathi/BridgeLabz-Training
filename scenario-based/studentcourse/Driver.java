package studentcourse;

import java.util.Scanner;
import studentcourse.impl.*;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student("Rahul");
        RegistrationService service = new CourseRegistrationService();

        try {
            OUTER:
            while (true) {
                System.out.println("1. Enroll Course\n2. View Courses\n3. Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1 -> {
                        System.out.print("Enter course name: ");
                        String cname = sc.next();
                        try {
                            service.register(student, new Course(cname));
                            System.out.println("Course enrolled");
                        } catch (CourseLimitExceededException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 2 -> student.showCourses();
                    default -> {
                        break OUTER;
                    }
                }
            }
        } finally {
            sc.close();
        }
    }
}

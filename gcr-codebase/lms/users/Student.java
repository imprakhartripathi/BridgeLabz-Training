package lms.users;

import lms.impl.User;
import lms.impl.UserFactory;

public class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a " + UserFactory.UserType.STUDENT.getDisplayName());
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

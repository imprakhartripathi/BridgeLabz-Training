package lms.impl;

import lms.users.*;

public class UserFactory {

    public enum UserType {

        STUDENT("Student"),
        FACULTY("Faculty"),
        LIBRARIAN("Librarian");

        private final String displayName;

        UserType(String usertype) {
            this.displayName = usertype;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public static User createUser(UserType type, String name) {
        return switch (type) {
            case STUDENT -> new Student(name);
            case FACULTY -> new Faculty(name);
            case LIBRARIAN -> new Librarian(name);
            default -> throw new IllegalStateException("Unexpected user type");
        };
    }
}

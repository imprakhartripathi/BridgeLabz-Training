public class Course {
    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        if (duration <= 0 || fee < 0) {
            throw new IllegalArgumentException("Invalid course details");
        }
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(
            "Course: " + courseName +
            ", Duration: " + duration + " months" +
            ", Fee: " + fee +
            ", Institute: " + instituteName
        );
    }

    static void updateInstituteName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Institute name cannot be empty");
        }
        instituteName = name;
    }

    public static void main(String[] args) {
        Course.updateInstituteName("XYZ Institute");
        Course c = new Course("Java", 6, 30000);
        c.displayCourseDetails();
    }
}

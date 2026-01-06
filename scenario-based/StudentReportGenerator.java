import java.util.*;

public class StudentReportGenerator {

    static class InvalidMarkException extends Exception {
        public InvalidMarkException(String msg) {
            super(msg);
        }
    }

    static class Student {
        String name;
        String[] subjects;
        int[] marks;

        Student(String name, String[] subjects, int[] marks) {
            this.name = name;
            this.subjects = subjects;
            this.marks = marks;
        }
    }

    public static double calculateAverage(int[] marks) throws InvalidMarkException {
        int sum = 0;
        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Invalid mark detected: " + m);
            }
            sum += m;
        }
        return sum / (double) marks.length;
    }

    public static String assignGrade(double avg) {
        if (avg >= 80)
            return "A";
        if (avg >= 60)
            return "B";
        if (avg >= 40)
            return "C";
        return "F";
    }

    public static void displayReport(Student s) throws InvalidMarkException {
        System.out.println("\n=================================");
        System.out.println("          REPORT CARD");
        System.out.println("=================================");
        System.out.println("Student Name : " + s.name);
        System.out.println("---------------------------------");

        for (int i = 0; i < s.subjects.length; i++) {
            System.out.printf("%-15s : %3d%n", s.subjects[i], s.marks[i]);
        }

        double avg = calculateAverage(s.marks);
        System.out.println("---------------------------------");
        System.out.printf("Average Marks : %.2f%n", avg);
        System.out.println("Grade         : " + assignGrade(avg));
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("=================================");
        System.out.println("     STUDENT REPORT GENERATOR");
        System.out.println("=================================");

        System.out.print("Enter number of students: ");
        int studentCount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n---------------------------------");
            System.out.println("Entering details for Student " + (i + 1));
            System.out.println("---------------------------------");

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Number of subjects: ");
            int subjectCount = Integer.parseInt(sc.nextLine());

            String[] subjects = new String[subjectCount];
            int[] marks = new int[subjectCount];

            System.out.println("\nEnter Subject Names:");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                subjects[j] = sc.nextLine();
            }

            System.out.println("\nEnter Marks (0 to 100):");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("  " + subjects[j] + ": ");
                marks[j] = Integer.parseInt(sc.nextLine());
            }

            students.add(new Student(name, subjects, marks));
        }

        try {
            for (Student s : students) {
                displayReport(s);
            }
        } catch (InvalidMarkException e) {
            System.out.println("\nERROR: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

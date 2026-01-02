public class StudentDemo {
    String name, rollNumber;
    double m1, m2, m3;

    void calculateGrade() {
        double avg = (m1 + m2 + m3) / 3;

        if (avg >= 75)
            System.out.println("Grade A");
        else if (avg >= 60)
            System.out.println("Grade B");
        else
            System.out.println("Grade C");
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + m1);
        System.out.println("Mark2: " + m2);
        System.out.println("Mark3: " + m3);
        calculateGrade();
    }

    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo();
        s1.name = "Thamarai";
        s1.rollNumber = "ECE001";
        s1.m1 = 80;
        s1.m2 = 70;
        s1.m3 = 75;

        StudentDemo s2 = new StudentDemo();
        s2.name = "Kannan";
        s2.rollNumber = "CSC002";
        s2.m1 = 60;
        s2.m2 = 65;
        s2.m3 = 50;

        s1.display();
        s2.display();
    }
}


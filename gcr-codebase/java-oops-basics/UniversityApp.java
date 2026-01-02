// Public parent / wrapper class
public class UniversityApp {

    public static void main(String[] args) {
        PostgraduateDemoStudent ps = new PostgraduateDemoStudent();
        ps.rollNumber = 101;
        ps.name = "Alice";
        ps.setCGPA(8.7);

        ps.display();
        System.out.println("CGPA: " + ps.getCGPA());
    }
}

class DemoStudent {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
        System.out.println("CGPA set to: " + CGPA + " for " + name);
    }

    public double getCGPA() {
        return CGPA;
    }
}
class PostgraduateDemoStudent extends DemoStudent {
    void display() {
        System.out.println("Roll Number: " + rollNumber + " Name: " + name);
    }
}

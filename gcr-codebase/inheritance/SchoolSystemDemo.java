class PersonOOPSD {
    protected String name;
    protected int age;

    PersonOOPSD(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends PersonOOPSD {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher teaching " + subject);
    }
}

class StudentOOPSD extends PersonOOPSD {
    private String grade;

    StudentOOPSD(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends PersonOOPSD {
    private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is Staff working in " + department);
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Maths");
        StudentOOPSD s = new StudentOOPSD("Rahul", 16, "10th");
        Staff st = new Staff("Anita", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

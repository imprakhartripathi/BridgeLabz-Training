package reflections;

import java.lang.reflect.Constructor;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Constructor<Student> c =
                Student.class.getDeclaredConstructor(String.class);
        Student s = c.newInstance("Aman");
        System.out.println(s.name);
    }
}

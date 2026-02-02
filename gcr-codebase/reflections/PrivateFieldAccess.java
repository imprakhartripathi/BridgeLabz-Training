package reflections;

import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field f = Person.class.getDeclaredField("age");
        f.setAccessible(true);
        f.setInt(p, 30);
        System.out.println("Age: " + f.getInt(p));
    }
}

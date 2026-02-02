package reflections;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Prakhar")
class Book {}

public class RuntimeAnnotationReader {
    public static void main(String[] args) {
        Author a = Book.class.getAnnotation(Author.class);
        System.out.println(a.name());
    }
}

package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Service {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    void process() {}
}

public class RepeatableAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method m = Service.class.getDeclaredMethod("process");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport r : reports) {
            System.out.println(r.description());
        }
    }
}

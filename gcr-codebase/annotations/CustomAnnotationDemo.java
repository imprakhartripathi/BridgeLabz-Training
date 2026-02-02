package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Prakhar")
    void completeTask() {
        System.out.println("Task completed");
    }
}

public class CustomAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getDeclaredMethod("completeTask");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println(info.priority() + " - " + info.assignedTo());
    }
}

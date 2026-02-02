package reflections;

import java.lang.reflect.Method;

class Worker {
    void work() throws InterruptedException {
        Thread.sleep(300);
    }
}

public class MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        Worker w = new Worker();
        Method m = Worker.class.getDeclaredMethod("work");

        long start = System.nanoTime();
        m.invoke(w);
        long end = System.nanoTime();

        System.out.println("Time (ns): " + (end - start));
    }
}

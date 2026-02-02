package reflections;

import java.lang.reflect.Method;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
}

public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Method m = MathOperations.class.getMethod("add", int.class, int.class);
        System.out.println(m.invoke(obj, 10, 5));
    }
}

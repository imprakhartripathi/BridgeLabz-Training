package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int x) {
        if (cache.containsKey(x)) {
            return cache.get(x);
        }
        int result = x * x;
        cache.put(x, result);
        return result;
    }
}

public class CacheAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("square", int.class);

        System.out.println(c.square(5));
        System.out.println(c.square(5)); // cached
    }
}

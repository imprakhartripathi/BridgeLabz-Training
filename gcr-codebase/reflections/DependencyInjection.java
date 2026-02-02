package reflections;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    @Inject
    Engine engine;
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        for (Field f : Car.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(car, new Engine());
            }
        }
        car.engine.start();
    }
}

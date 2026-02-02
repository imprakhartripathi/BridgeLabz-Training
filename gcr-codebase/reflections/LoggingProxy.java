package reflections;

import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class LoggingProxy {
    public static void main(String[] args) {
        Greeting g = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(), new Class[]{Greeting.class}, (proxy, method, methodArgs) -> {
            System.out.println("Calling: " + method.getName());
            return method.invoke(new GreetingImpl(), methodArgs);
        });

        g.sayHello();
    }
}

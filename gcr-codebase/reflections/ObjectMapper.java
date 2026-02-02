package reflections;

import java.lang.reflect.Field;
import java.util.Map;

class User {
    String name;
    int age;
}

public class ObjectMapper {

    static <T> T toObject(Class<T> cls, Map<String, Object> data) throws Exception {
        T obj = cls.getDeclaredConstructor().newInstance();
        for (Field f : cls.getDeclaredFields()) {
            f.setAccessible(true);
            f.set(obj, data.get(f.getName()));
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = Map.of("name", "Ravi", "age", 21);
        User u = toObject(User.class, map);
        System.out.println(u.name + " " + u.age);
    }
}

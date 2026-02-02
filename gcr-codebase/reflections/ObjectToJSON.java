package reflections;

import java.lang.reflect.Field;

class Product {
    String name = "Phone";
    int price = 20000;
}

public class ObjectToJSON {
    public static void main(String[] args) throws Exception {
        Product p = new Product();
        StringBuilder json = new StringBuilder("{");

        for (Field f : p.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            json.append("\"").append(f.getName()).append("\":")
                    .append("\"").append(f.get(p)).append("\",");
        }
        json.setLength(json.length() - 1);
        json.append("}");

        System.out.println(json);
    }
}

package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class StudentJsonDemo {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Rahul Sharma");
        student.put("age", 22);

        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Math");
        subjects.add("Physics");
        subjects.add("Computer Science");

        student.set("subjects", subjects);

        System.out.println("=== Student JSON Object ===");
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(student));
    }
}

package json;

import com.fasterxml.jackson.databind.*;
import java.util.*;

public class JsonFilterDemo {

    public static void main(String[] args) throws Exception {

        String jsonData = """
        [
          {"name":"Amit","age":28},
          {"name":"Neha","age":23},
          {"name":"Pooja","age":30},
          {"name":"Rahul","age":21}
        ]
        """;

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonData);

        System.out.println("=== Users with age > 25 ===");

        for (JsonNode node : root) {
            if (node.get("age").asInt() > 25) {
                System.out.println(
                        node.get("name").asText() +
                                " (Age: " + node.get("age").asInt() + ")"
                );
            }
        }
    }
}

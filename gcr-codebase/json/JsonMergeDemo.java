package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonMergeDemo {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode user = mapper.createObjectNode();
        user.put("id", 101);
        user.put("name", "Rahul");

        ObjectNode contact = mapper.createObjectNode();
        contact.put("email", "rahul@gmail.com");
        contact.put("city", "Delhi");

        user.set("contactDetails", contact);

        System.out.println("=== Merged JSON Object ===");
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(user));
    }
}

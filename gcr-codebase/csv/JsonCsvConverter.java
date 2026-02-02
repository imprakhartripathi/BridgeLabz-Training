package csv;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {

        System.out.println("=== JSON → CSV ===");
        jsonToCsv("students.json", "jsonstudents.csv");

        System.out.println("\n=== CSV → JSON ===");
        csvToJson("students.csv", "students_back.json");
    }


    private static void jsonToCsv(String jsonFile, String csvFile) throws Exception {

        JsonNode root = mapper.readTree(new File(jsonFile));

        BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));

        // write header
        bw.write("id,name,age,email");
        bw.newLine();

        for (JsonNode node : root) {
            bw.write(
                    node.get("id").asInt() + "," +
                            node.get("name").asText() + "," +
                            node.get("age").asInt() + "," +
                            node.get("email").asText()
            );
            bw.newLine();
        }

        bw.close();
        System.out.println("CSV file created: " + csvFile);
    }

    // ---------------- CSV → JSON ----------------

    private static void csvToJson(String csvFile, String jsonFile) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        ArrayNode array = mapper.createArrayNode();

        String line = br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            ObjectNode obj = mapper.createObjectNode();
            obj.put("id", Integer.parseInt(d[0]));
            obj.put("name", d[1]);
            obj.put("age", Integer.parseInt(d[2]));
            obj.put("email", d[3]);

            array.add(obj);
        }

        br.close();

        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File(jsonFile), array);

        System.out.println("JSON file recreated: " + jsonFile);
    }
}

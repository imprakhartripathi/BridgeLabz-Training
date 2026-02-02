package csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (!d[1].matches(".+@.+\\..+") || !d[2].matches("\\d{10}")) {
                System.out.println("Invalid: " + line);
            }
        }
        br.close();
    }
}

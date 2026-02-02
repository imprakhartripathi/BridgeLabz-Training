package csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line;

        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");

            int age = Integer.parseInt(d[2]);

            if (age > 25) {
                System.out.println(line);
            }
        }

        br.close();
    }
}

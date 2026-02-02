package csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (Integer.parseInt(d[3]) > 80) {
                System.out.println(line);
            }
        }
        br.close();
    }
}

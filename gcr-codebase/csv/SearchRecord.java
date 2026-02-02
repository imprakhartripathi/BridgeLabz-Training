package csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchRecord {
    public static void main(String[] args) throws Exception {
        String target = "Rahul";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(target)) {
                System.out.println(line);
            }
        }
        br.close();
    }
}

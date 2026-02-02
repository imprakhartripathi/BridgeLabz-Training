package csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRows {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        int count = -1;
        while (br.readLine() != null) count++;
        br.close();
        System.out.println("Rows: " + count);
    }
}

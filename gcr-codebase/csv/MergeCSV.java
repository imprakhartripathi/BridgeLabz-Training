package csv;

import java.io.*;

public class MergeCSV {

    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("merged_students.csv"));

        BufferedReader b1 = new BufferedReader(new FileReader("students1.csv"));
        BufferedReader b2 = new BufferedReader(new FileReader("students2.csv"));

        String line;

        bw.write(b1.readLine());
        bw.newLine();

        while ((line = b1.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        b2.readLine();

        while ((line = b2.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        b1.close();
        b2.close();
        bw.close();

        System.out.println("CSV files merged successfully into merged_students.csv");
    }
}

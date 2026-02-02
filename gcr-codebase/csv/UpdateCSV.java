package csv;

import java.io.*;

public class UpdateCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        FileWriter fw = new FileWriter("updated.csv");
        String line = br.readLine();
        fw.write(line + "\n");

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d[2].equals("IT")) {
                d[3] = String.valueOf((int)(Integer.parseInt(d[3]) * 1.1));
            }
            fw.write(String.join(",", d) + "\n");
        }
        br.close();
        fw.close();
    }
}

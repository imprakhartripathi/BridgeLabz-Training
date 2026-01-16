package filereader;

import java.io.*;

public class FileReaderReadLines {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

// PLEASE CREATE AN "input.txt" FILE IN THE PROJECT ROOT BEFORE RUNNING!!!!!!
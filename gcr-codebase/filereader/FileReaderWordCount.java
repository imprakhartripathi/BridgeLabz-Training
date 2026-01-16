package filereader;

import java.io.*;

public class FileReaderWordCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Something Search in the `input.txt` file: ");
        String word = sc.nextLine();
        int count = 0;

        String line;
        while ((line = br.readLine()) != null) {
            for (String w : line.split("\\s+")) {
                if (w.equalsIgnoreCase(word)) count++;
            }
        }
        br.close();
        System.out.println("Occurrence in the file: " + count);
    }
}

// PLEASE CREATE AN "input.txt" FILE IN THE PROJECT ROOT BEFORE RUNNING!!!!!!
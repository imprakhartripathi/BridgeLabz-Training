package runtimeanalysis;

import java.io.*;

public class FileReadingComparison {

    public static void readUsingFileReader(String path) throws IOException {
        try (FileReader fr = new FileReader(path)) {
            while (fr.read() != -1) {}
        }
    }

    public static void readUsingInputStreamReader(String path) throws IOException {
        try (InputStreamReader isr =
                     new InputStreamReader(new FileInputStream(path))) {
            while (isr.read() != -1) {}
        }
    }

    public static void main(String[] args) throws Exception {
        String filePath = "input.txt";

        long start, fileReaderTime, inputStreamReaderTime;

        start = System.nanoTime();
        readUsingFileReader(filePath);
        fileReaderTime = System.nanoTime() - start;

        start = System.nanoTime();
        readUsingInputStreamReader(filePath);
        inputStreamReaderTime = System.nanoTime() - start;

        System.out.println("\n\n--------File Reading Performance Comparison--------");
        System.out.printf("FileReader        : %d ns\n", fileReaderTime);
        System.out.printf("InputStreamReader : %d ns", inputStreamReaderTime);

        // Determine fastest
        System.out.print("\n\nFastest Approach: ");
        if (inputStreamReaderTime < fileReaderTime) {
            System.out.print("InputStreamReader (more efficient for large files)");
        } else {
            System.out.print("FileReader (better for pure text files)");
        }
    }
}

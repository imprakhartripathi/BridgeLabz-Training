package inputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderReadFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("input.txt"), StandardCharsets.UTF_8)
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

// PLEASE CREATE AN "input.txt" FILE IN THE PROJECT ROOT BEFORE RUNNING!!!!!!
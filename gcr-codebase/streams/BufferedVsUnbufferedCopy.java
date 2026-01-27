package streams;

import java.io.*;

public class BufferedVsUnbufferedCopy {
    private static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) throws IOException {
        String src = "largefile.dat";

        long start, end;

        // Unbuffered
        start = System.nanoTime();
        copyUnbuffered(src, "unbuffered.dat");
        end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start));

        // Buffered
        start = System.nanoTime();
        copyBuffered(src, "buffered.dat");
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start));
    }

    static void copyUnbuffered(String src, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    static void copyBuffered(String src, String dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}

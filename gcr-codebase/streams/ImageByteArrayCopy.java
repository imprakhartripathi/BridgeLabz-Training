package streams;

import java.io.*;

public class ImageByteArrayCopy {
    public static void main(String[] args) throws IOException {
        byte[] imageBytes;

        try (FileInputStream fis = new FileInputStream("image.jpg");
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            fis.transferTo(baos);
            imageBytes = baos.toByteArray();
        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream("image_copy.jpg")) {

            bais.transferTo(fos);
        }

        System.out.println("Image copied successfully.");
    }
}

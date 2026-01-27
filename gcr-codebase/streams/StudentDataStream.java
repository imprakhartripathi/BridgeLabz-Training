package streams;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) throws IOException {
        String file = "student.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(1);
            dos.writeUTF("Rahul");
            dos.writeDouble(8.5);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
        }
    }
}

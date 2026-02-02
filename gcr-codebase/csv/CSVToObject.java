package csv;

import java.io.BufferedReader;
import java.io.FileReader;

class Student {
    int id;
    String name;
    Student(int i, String n) { id = i; name = n; }
}

public class CSVToObject {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            Student s = new Student(Integer.parseInt(d[0]), d[1]);
            System.out.println(s.name);
        }
        br.close();
    }
}

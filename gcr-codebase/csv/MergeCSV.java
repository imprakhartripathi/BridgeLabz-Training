package csv;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {
        Map<String,String> map = new HashMap<>();
        BufferedReader b1 = new BufferedReader(new FileReader("students1.csv"));
        b1.readLine();
        String l;
        while ((l=b1.readLine())!=null) {
            String[] d = l.split(",");
            map.put(d[0], l);
        }
        BufferedReader b2 = new BufferedReader(new FileReader("students2.csv"));
        b2.readLine();
        while ((l=b2.readLine())!=null) {
            String[] d = l.split(",");
            System.out.println(map.get(d[0]) + "," + d[1] + "," + d[2]);
        }
        b1.close(); b2.close();
    }
}

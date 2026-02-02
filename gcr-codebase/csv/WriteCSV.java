package csv;

import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("employees.csv");
        fw.write("ID,Name,Dept,Salary\n");
        fw.write("1,Alice,IT,50000\n");
        fw.write("2,Bob,HR,40000\n");
        fw.close();
    }
}

package functional_interfaces;

interface Exporter {
    void exportCSV();
    default void exportJSON() {
        System.out.println("Exported to JSON");
    }
}

class Report implements Exporter {
    public void exportCSV() {
        System.out.println("Exported to CSV");
    }
}

public class DataExportDemo {
    public static void main(String[] args) {
        Exporter e = new Report();
        e.exportCSV();
        e.exportJSON();
    }
}

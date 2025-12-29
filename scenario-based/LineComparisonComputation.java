import java.util.Objects;
import java.util.Scanner;

class Line implements Comparable<Line> {
    private final double length;

    public Line(int x1, int y1, int x2, int y2) {
        this.length = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }

    public double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line other = (Line) obj;
        return Double.compare(this.length, other.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length, other.length);
    }
}

public class LineComparisonComputation {

    private static int readCoordinate(Scanner sc, String name) {
        System.out.print("Enter " + name + ": ");
        return sc.nextInt();
    }

    private static Line readLine(Scanner sc, int lineNumber) {
        System.out.println("\nEnter coordinates for Line " + lineNumber);

        int x1 = readCoordinate(sc, "x1");
        int y1 = readCoordinate(sc, "y1");
        int x2 = readCoordinate(sc, "x2");
        int y2 = readCoordinate(sc, "y2");

        return new Line(x1, y1, x2, y2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        try (Scanner sc = new Scanner(System.in)) {

            Line line1 = readLine(sc, 1);
            Line line2 = readLine(sc, 2);

            System.out.println("\nLength of Line 1: " + line1.getLength());
            System.out.println("Length of Line 2: " + line2.getLength());

            // UC 2: Equality
            if (line1.equals(line2)) {
                System.out.println("Both lines are equal");
            } else {
                System.out.println("Lines are not equal");
            }

            // UC 3: Comparison
            int result = line1.compareTo(line2);
            if (result > 0) {
                System.out.println("Line 1 is greater than Line 2");
            } else if (result < 0) {
                System.out.println("Line 1 is less than Line 2");
            } else {
                System.out.println("Both lines are equal");
            }
        }
    }
}

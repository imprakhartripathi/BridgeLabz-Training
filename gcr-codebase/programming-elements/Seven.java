import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            
            double perimeter = 2 * (length + width);
            System.out.println(perimeter);
        }
    }
}

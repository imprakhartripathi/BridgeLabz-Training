import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            
            // Perimeter of rectangle formula: P = 2 * (length + width)
            double perimeter = 2 * (length + width);
            System.out.println(perimeter);
        }
    }
}

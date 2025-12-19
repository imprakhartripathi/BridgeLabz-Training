import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the perimeter of the square: ");
            double perimeter = sc.nextDouble();
            
            // Side of square from perimeter: side = perimeter / 4 (all sides equal)
            double side = perimeter / 4;
            
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
    }
}

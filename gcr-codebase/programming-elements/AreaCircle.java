import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextDouble();
            // Area of circle formula: A = pi * r^2
            double area = Math.PI * radius * radius;
            
            System.out.println(area);
        }
    }
}

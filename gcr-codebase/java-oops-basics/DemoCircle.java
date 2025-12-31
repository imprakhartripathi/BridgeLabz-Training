import java.util.Scanner;

public class DemoCircle {
    double radius;

    DemoCircle() {
        this(1.0);
    }

    DemoCircle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        DemoCircle c;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius of circle: ");
            try {
                c = new DemoCircle(sc.nextDouble());
            } catch (Exception e) {
                System.out.println("Invalid input. Using default radius.");
                c = new DemoCircle();
            }

            System.out.println("Area: " + c.area());
        }
    }
}


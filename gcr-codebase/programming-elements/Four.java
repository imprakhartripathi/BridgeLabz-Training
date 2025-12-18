import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            
            System.out.println(area);
        }
    }
}

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextDouble();
            double height = sc.nextDouble();
            
            double volume = Math.PI * radius * radius * height;
            System.out.println(volume);
        }
    }
}

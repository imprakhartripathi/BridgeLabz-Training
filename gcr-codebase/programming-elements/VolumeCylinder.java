import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextDouble();
            double height = sc.nextDouble();
            
            // Volume of cylinder formula: V = Pi * r^2 * h
            double volume = Math.PI * radius * radius * height;
            System.out.println(volume);
        }
    }
}

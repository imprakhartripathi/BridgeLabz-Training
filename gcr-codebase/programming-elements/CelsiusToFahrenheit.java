import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double celsius = sc.nextDouble();
            // Celsius to Fahrenheit conversion formula: F = (C * 9/5) + 32
            double fahrenheit = (celsius * 9 / 5) + 32;
            
            System.out.println(fahrenheit);
        }
    }
}

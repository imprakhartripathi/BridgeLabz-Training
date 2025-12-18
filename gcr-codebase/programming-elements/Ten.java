
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter distance in kilometers:");
            double km = sc.nextDouble();
            double miles = km * 0.621371;
            System.out.println("Miles = " + miles);
        }
    }
}
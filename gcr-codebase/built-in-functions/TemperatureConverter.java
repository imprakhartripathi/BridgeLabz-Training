// 8. Temperature Converter:
// ○ Write a program that converts temperatures between Fahrenheit and Celsius.
// ○ The program should have separate functions for converting from Fahrenheit to
// Celsius and from Celsius to Fahrenheit.

import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter temperature value");
            double value = sc.nextDouble();

            System.out.println("Enter type c or f");
            String type = sc.next();

            if (type.equals("c")) {
                System.out.println(celsiusToFahrenheit(value));
            } else {
                System.out.println(fahrenheitToCelsius(value));
            }
        }
    }
}

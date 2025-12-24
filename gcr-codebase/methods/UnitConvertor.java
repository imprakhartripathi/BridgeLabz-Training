/*
Q4, Q5, and Q6 COMBINED

Extend or Create a UnitConvertor utility class similar to the one shown in the notes.
These three questions are combined because they all perform unit conversions.

Q4:
- Kilometers to Miles
- Miles to Kilometers
- Meters to Feet
- Feet to Meters

Q5:
- Yards to Feet
- Feet to Yards
- Meters to Inches
- Inches to Meters
- Inches to Centimeters

Q6:
- Fahrenheit to Celsius
- Celsius to Fahrenheit
- Pounds to Kilograms
- Kilograms to Pounds
- Gallons to Liters
- Liters to Gallons
*/

import java.util.Scanner;

public class UnitConvertor {

    // Q4
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    // Q5
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Q6
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            boolean running = true;

            System.out.println("\n--- UNIT CONVERTER MENU ---");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Meters to Feet");
            System.out.println("4. Feet to Meters");
            System.out.println("5. Yards to Feet");
            System.out.println("6. Feet to Yards");
            System.out.println("7. Meters to Inches");
            System.out.println("8. Inches to Meters");
            System.out.println("9. Inches to Centimeters");
            System.out.println("10. Fahrenheit to Celsius");
            System.out.println("11. Celsius to Fahrenheit");
            System.out.println("12. Pounds to Kilograms");
            System.out.println("13. Kilograms to Pounds");
            System.out.println("14. Gallons to Liters");
            System.out.println("15. Liters to Gallons");
            System.out.println("0. Exit");

            while (running) {

                System.out.print("Select conversion type: ");
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting Unit Converter...");
                    break;
                }

                System.out.print("Enter value: ");
                double value = sc.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + convertKmToMiles(value));
                    case 2 -> System.out.println("Result: " + convertMilesToKm(value));
                    case 3 -> System.out.println("Result: " + convertMetersToFeet(value));
                    case 4 -> System.out.println("Result: " + convertFeetToMeters(value));
                    case 5 -> System.out.println("Result: " + convertYardsToFeet(value));
                    case 6 -> System.out.println("Result: " + convertFeetToYards(value));
                    case 7 -> System.out.println("Result: " + convertMetersToInches(value));
                    case 8 -> System.out.println("Result: " + convertInchesToMeters(value));
                    case 9 -> System.out.println("Result: " + convertInchesToCentimeters(value));
                    case 10 -> System.out.println("Result: " + convertFahrenheitToCelsius(value));
                    case 11 -> System.out.println("Result: " + convertCelsiusToFahrenheit(value));
                    case 12 -> System.out.println("Result: " + convertPoundsToKilograms(value));
                    case 13 -> System.out.println("Result: " + convertKilogramsToPounds(value));
                    case 14 -> System.out.println("Result: " + convertGallonsToLiters(value));
                    case 15 -> System.out.println("Result: " + convertLitersToGallons(value));
                    default -> System.out.println("Invalid choice. Try again.");
                }
                System.out.println();
            }
        }
    }
}

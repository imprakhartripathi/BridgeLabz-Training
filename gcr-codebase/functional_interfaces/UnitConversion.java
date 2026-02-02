package functional_interfaces;

import java.util.Scanner;

interface Converter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
}

public class UnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance (KM): ");
        System.out.println("Converted in Miles: " + Converter.kmToMiles(sc.nextInt()));
    }
}

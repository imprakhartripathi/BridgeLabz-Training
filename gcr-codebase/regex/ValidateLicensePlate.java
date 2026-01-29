package regex;

import java.util.*;

public class ValidateLicensePlate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String plate = sc.nextLine().toUpperCase().trim();

        String toyRegex = "^[A-Z]{2}\\d{4}$";

        List<String> stateCodes = Arrays.asList(
                "AP","AR","AS","BR","CG","CH","DD","DL","DN","GA",
                "GJ","HP","HR","JH","JK","KA","KL","LA","LD","MH",
                "ML","MN","MP","MZ","NL","OD","PB","PY","RJ","SK",
                "TN","TR","TS","UK","UP","WB"
        );

        String stateRegex = "(" + String.join("|", stateCodes) + ")";

        String indianRegex = "^" + stateRegex + "\\s?\\d{1,2}" + "\\s?[A-Z]{1,3}" + "\\s?\\d{4}$";

        String bharatRegex = "^\\d{2}\\s?BH\\s?\\d{4}\\s?[A-Z]{2}$";

        if (plate.matches(toyRegex)) {
            System.out.println("Valid (Toy Format)");
        } else if (plate.matches(indianRegex)) {
            System.out.println("Valid (Indian Standard Plate)");
        } else if (plate.matches(bharatRegex)) {
            System.out.println("Valid (Bharat Series Plate)");
        } else {
            System.out.println("Invalid License Plate");
        }
    }
}

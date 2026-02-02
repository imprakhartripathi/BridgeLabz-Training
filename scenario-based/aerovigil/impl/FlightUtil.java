package aerovigil.impl;

public class FlightUtil {

    public boolean validateFlightNumber(String num) throws InvalidFlightException {
        if (!num.matches("FL-[1-9][0-9]{3}"))
            throw new InvalidFlightException("The flight number " + num + " is invalid");
        return true;
    }

    public boolean validateFlightName(String name) throws InvalidFlightException {
        if (!name.matches("SpiceJet|Vistara|IndiGo|Air Arabia"))
            throw new InvalidFlightException("The flight name " + name + " is invalid");
        return true;
    }

    public boolean validatePassengerCount(int count, String name) throws InvalidFlightException {
        int max = switch (name) {
            case "SpiceJet" -> 396;
            case "Vistara" -> 615;
            case "IndiGo" -> 230;
            default -> 130;
        };
        if (count <= 0 || count > max)
            throw new InvalidFlightException("The passenger count " + count + " is invalid for " + name);
        return true;
    }

    public double calculateFuelToFillTank(String name, double fuel) throws InvalidFlightException {
        int max = switch (name) {
            case "SpiceJet" -> 200000;
            case "Vistara" -> 300000;
            case "IndiGo" -> 250000;
            default -> 150000;
        };
        if (fuel < 0 || fuel > max)
            throw new InvalidFlightException("Invalid fuel level for " + name);
        return max - fuel;
    }
}

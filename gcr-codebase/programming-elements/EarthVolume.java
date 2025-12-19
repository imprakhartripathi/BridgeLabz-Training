public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14;

        // Volume of sphere formula: V = (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        // Convert radius from km to miles: 1 km ≈ 1/1.6 miles
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

public class KmToMilesFixed {
    public static void main(String[] args) {
        double kilometers = 10.8;
        // Convert km to miles: 1 km = 1/1.6 miles
        double miles = kilometers / 1.6;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

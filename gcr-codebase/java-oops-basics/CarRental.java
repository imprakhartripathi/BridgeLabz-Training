public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    private static final double DAILY_RATE = 1000.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        if (rentalDays <= 0) {
            throw new IllegalArgumentException("Rental days must be positive");
        }
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + ", Days: " + rentalDays);
    }

    double totalCost() {
        return rentalDays * DAILY_RATE;
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Mike", "SUV", 5);
        cr.display();
        System.out.println("Total Cost of Renting: " + cr.totalCost());
    }
}

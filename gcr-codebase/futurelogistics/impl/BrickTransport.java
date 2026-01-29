package futurelogistics.impl;

public class BrickTransport extends GoodsTransport {
    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String id, String date, int rating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(id, date, rating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public String vehicleSelection() {
        if (brickQuantity < 300) return "Truck";
        if (brickQuantity <= 500) return "Lorry";
        return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;

        float discount = 0;
        if (transportRating == 5) discount = price * 0.2f;
        else if (transportRating >= 3) discount = price * 0.1f;

        int vehicleCost = vehicleSelection().equalsIgnoreCase("Truck") ? 1000 :
                vehicleSelection().equalsIgnoreCase("Lorry") ? 1700 : 3000;

        return price + tax + vehicleCost - discount;
    }
}

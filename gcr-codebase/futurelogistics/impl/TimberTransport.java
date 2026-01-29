package futurelogistics.impl;

public class TimberTransport extends GoodsTransport {
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String id, String date, int rating,
                           float length, float radius, String type, float price) {
        super(id, date, rating);
        this.timberLength = length;
        this.timberRadius = radius;
        this.timberType = type;
        this.timberPrice = price;
    }

    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;
        if (area < 250) return "Truck";
        if (area <= 400) return "Lorry";
        return "MonsterLorry";
    }

    public float calculateTotalCharge() {
        float volume = 3.147f * timberRadius * timberRadius * timberLength;
        float rate = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;
        float price = volume * timberPrice * rate;
        float tax = price * 0.3f;

        float discount = 0;
        if (transportRating == 5) discount = price * 0.2f;
        else if (transportRating >= 3) discount = price * 0.1f;

        int vehicleCost = vehicleSelection().equalsIgnoreCase("Truck") ? 1000 :
                vehicleSelection().equalsIgnoreCase("Lorry") ? 1700 : 3000;

        return price + tax + vehicleCost - discount;
    }
}

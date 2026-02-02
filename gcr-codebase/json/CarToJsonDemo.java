package json;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand;
    public int year;
    public double price;

    Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
}

public class CarToJsonDemo {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        Car car = new Car("Tesla", 2023, 6500000);

        System.out.println("=== Java Object Converted to JSON ===");
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(car));
    }
}

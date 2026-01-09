package flightbooking.impl;

public class Flight {
    public String flightNo;
    public String source;
    public String destination;

    public Flight(String flightNo, String source, String destination) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return flightNo + " : " + source + " -> " + destination;
    }
}

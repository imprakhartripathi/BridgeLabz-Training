package railway.model;

public class Train implements Comparable<Train> {

    private String trainNumber;
    private int arrivalTime; // simplified as integer (e.g., 900 = 9:00 AM)

    public Train(String trainNumber, int arrivalTime) {
        this.trainNumber = trainNumber;
        this.arrivalTime = arrivalTime;
    }

    public String getTrainNumber() { return trainNumber; }
    public int getArrivalTime() { return arrivalTime; }

    @Override
    public int compareTo(Train other) {
        return Integer.compare(this.arrivalTime, other.arrivalTime);
    }
}
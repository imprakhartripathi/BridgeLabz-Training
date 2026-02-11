package eventfeedback;

import eventfeedback.analyzer.*;

public class Driver {
    public static void main(String[] args) {

        FeedbackService service = new FeedbackService();

        service.addRating("E1", 5);
        service.addRating("E1", 4);
        service.addRating("E2", 3);
        service.addRating("E2", 5);

        System.out.println("Average E1: " + service.calculateAverage("E1"));
        System.out.println("Average E2: " + service.calculateAverage("E2"));
        System.out.println("Top Event: " + service.getTopRatedEvent());
    }
}

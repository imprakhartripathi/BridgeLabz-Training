package eventfeedback.analyzer;

import java.util.*;

public class FeedbackService {

    private Map<String, List<Integer>> feedbackMap = new HashMap<>();

    public void addRating(String eventId, int rating) {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5");
        }

        feedbackMap.computeIfAbsent(eventId, k -> new ArrayList<>()).add(rating);
    }

    public double calculateAverage(String eventId) {
        List<Integer> ratings = feedbackMap.get(eventId);
        return ratings.stream().mapToInt(i -> i).average().orElse(0.0);
    }

    public String getTopRatedEvent() {
        return feedbackMap.entrySet().stream()
                .max(Comparator.comparingDouble(e -> calculateAverage(e.getKey())))
                .map(Map.Entry::getKey)
                .orElse("No Events");
    }
}

package cinematime.impl;

import java.util.ArrayList;
import java.util.List;

public class CinemaManager {

    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    public void addMovie(String title, String time) {
        validateTime(time);
        titles.add(title);
        times.add(time);
        System.out.println("Movie added successfully.");
    }

    public void searchMovie(String keyword) {
        boolean found = false;

        for (int i = 0; i < titles.size(); i++) {
            try {
                if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(formatMovie(i));
                    found = true;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid index accessed during search.");
            }
        }

        if (!found) {
            System.out.println("No matching movies found.");
        }
    }

    public void displayAllMovies() {
        if (titles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }

        for (int i = 0; i < titles.size(); i++) {
            System.out.println(formatMovie(i));
        }
    }

    private String formatMovie(int index) {
        return String.format("Movie: %s | Time: %s", titles.get(index), times.get(index));
    }

    private void validateTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}"))
            throw new InvalidTimeFormatException("Time must be in HH:MM format");

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new InvalidTimeFormatException("Invalid time value: " + time);
        }
    }

    public void printReport() {
        String[] movieArray = titles.toArray(new String[0]);
        String[] timeArray = times.toArray(new String[0]);

        System.out.println("\n--- Cinema Schedule Report ---");
        for (int i = 0; i < movieArray.length; i++) {
            System.out.println(movieArray[i] + " @ " + timeArray[i]);
        }
    }
}

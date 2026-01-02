public class TemperatureAnalyzer {

    static void analyzeTemperatures(float[][] temps) {
        if (temps.length != 7 || temps[0].length != 24) {
            System.out.println("Invalid temperature data.");
            return;
        }

        float hottestAvg = Float.MIN_VALUE;
        float coldestAvg = Float.MAX_VALUE;
        int hottestDay = -1;
        int coldestDay = -1;

        for (int day = 0; day < 7; day++) {
            float sum = 0;
            for (int hour = 0; hour < 24; hour++) {
                sum += temps[day][hour];
            }

            float avg = sum / 24;
            System.out.println("Average temperature for Day " + (day + 1) + ": " + avg);

            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = day;
            }

            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = day;
            }
        }

        System.out.println("Hottest Day: Day " + (hottestDay + 1));
        System.out.println("Coldest Day: Day " + (coldestDay + 1));
    }

    public static void main(String[] args) {
        float[][] weekTemps = new float[7][24];

        // Sample data (for demo)
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                weekTemps[i][j] = 20 + i; // mock data
            }
        }

        analyzeTemperatures(weekTemps);
    }
}

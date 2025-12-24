/*
Program:
Generate five 4-digit random numbers and find their
average, minimum, and maximum values.
*/

public class RandomNumberAnalysis {

    // Method to generate array of 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random numbers between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, minimum, and maximum
    // Returns array: [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = (int) Math.min(min, num);
            max = (int) Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);
        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nAverage = " + result[0]);
        System.out.println("Minimum = " + (int) result[1]);
        System.out.println("Maximum = " + (int) result[2]);
    }
}

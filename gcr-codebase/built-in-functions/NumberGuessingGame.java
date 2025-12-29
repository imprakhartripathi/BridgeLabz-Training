// 1. Number Guessing Game:
// ○ Write a Java program where the user thinks of a number between 1 and 100, and
// the computer tries to guess the number by generating random guesses.
// ○ The user provides feedback by indicating whether the guess is high, low, or
// correct. The program should be modular, with different functions for generating
// guesses, receiving user feedback, and determining the next guess.

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    static String getFeedback(Scanner sc) {
        System.out.println("Enter feedback high low or correct");
        return sc.next();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean found = false;

        while (!found) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses " + guess);

            String feedback = getFeedback(sc);

            switch (feedback) {
                case "high" -> high = guess - 1;
                case "low" -> low = guess + 1;
                default -> {
                    System.out.println("Number guessed correctly");
                    found = true;
                }
            }
        }
    }
}

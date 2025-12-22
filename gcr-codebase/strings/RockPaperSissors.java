// Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
// Hint => 
// The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
// Create a Method to find the Computer Choice using the Math.random
// Create a Method to find the winner between the user and the computer
// Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
// Create a Method to display the results of every game and also display the average and percentage wins 
// In the main take user input for the number of games and call methods to display results

import java.util.Scanner;

public class RockPaperSissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();

        String[][] results = new String[games][4];
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.println("Enter your choice: 1-Rock | 2-Paper | 3-Scissors");
            int playerChoice = sc.nextInt();

            int computerChoice = getComputerChoice();

            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = convertChoice(playerChoice);
            results[i][2] = convertChoice(computerChoice);
            results[i][3] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(results, stats);

        sc.close();
    }

    // Method to generate computer choice (1–3)
    public static int getComputerChoice() {
        return (int) (Math.random() * 3) + 1;
    }

    // Method to determine winner using numbers
    public static String findWinner(int player, int computer) {

        if (player == computer)
            return "Draw";

        if (player == 1 && computer == 3 ||
            player == 2 && computer == 1 ||
            player == 3 && computer == 2) {
            return "Player";
        }

        return "Computer";
    }

    // Method to convert number to choice string
    public static String convertChoice(int choice) {

        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid";
        }
    }

    // Method to calculate averages and percentages
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double playerPercentage = ((double) playerWins / totalGames) * 100;
        double computerPercentage = ((double) computerWins / totalGames) * 100;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercentage) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage) + "%";

        return stats;
    }

    // Method to display results and stats
    public static void displayResults(String[][] results, String[][] stats) {

        System.out.println("\nGAME RESULTS");
        System.out.println("------------------------------------------------");
        System.out.println("Game | Player Choice | Computer Choice | Winner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-5s| %-14s| %-16s| %-8s\n",
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3]);
        }

        System.out.println("\nOVERALL STATS");
        System.out.println("-------------------------------");
        System.out.println("Entity    | Wins | Win %");
        System.out.println("-------------------------------");

        for (String[] stat : stats) {
            System.out.printf("%-9s| %-5s| %-6s\n", stat[0], stat[1], stat[2]);
        }
    }
}

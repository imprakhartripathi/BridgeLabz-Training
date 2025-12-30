import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame {

    private static final int WIN_POS = 100;

    enum Option {
        NO_PLAY,
        LADDER,
        SNAKE
    }

    static class Player {
        String name;
        int position;
        int diceCount;

        Player(String name) {
            this.name = name;
            this.position = 0;
            this.diceCount = 0;
        }
    }

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }

    private static Option getOption(Random random) {
        return Option.values()[random.nextInt(3)];
    }

    private static boolean playTurn(Player player, Random random) {
        int dice = rollDice(random);
        player.diceCount++;

        Option option = getOption(random);
        int from = player.position;

        switch (option) {
            case NO_PLAY -> {
                // no movement
            }
            case LADDER -> {
                if (player.position + dice <= WIN_POS) {
                    player.position += dice;
                }
            }
            case SNAKE -> {
                player.position -= dice;
                if (player.position < 0) {
                    player.position = 0;
                }
            }
        }

        System.out.printf(
                "%-15s %-6d %-10s %-6d %-6d%n",
                player.name,
                dice,
                option,
                from,
                player.position);

        return option == Option.LADDER;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();

            System.out.print("Enter number of players: ");
            int numberOfPlayers = sc.nextInt();
            sc.nextLine();

            if (numberOfPlayers < 1) {
                System.out.println("At least one player is required.");
                return;
            }

            Player[] players = new Player[numberOfPlayers];

            for (int i = 0; i < numberOfPlayers; i++) {
                System.out.print("Enter name for Player " + (i + 1) + ": ");
                players[i] = new Player(sc.nextLine());
            }

            // Draw table header
            System.out.println();
            System.out.printf(
                    "%-15s %-6s %-10s %-6s %-6s%n",
                    "Player",
                    "Dice",
                    "Option",
                    "From",
                    "To");
            System.out.println("--------------------------------------------------");
            // try {
            //     Thread.sleep(1000); // 1 second
            // } catch (InterruptedException e) {
            //     Thread.currentThread().interrupt();
            // }

            int currentPlayerIndex = 0;

            while (true) {
                Player currentPlayer = players[currentPlayerIndex];

                boolean extraTurn;
                do {
                    extraTurn = playTurn(currentPlayer, random);

                    if (currentPlayer.position == WIN_POS) {
                        System.out.println();
                        System.out.println(currentPlayer.name + " WON!\n");

                        // Final result table
                        System.out.printf(
                                "%-15s %-12s %-14s%n",
                                "Player",
                                "Dice Rolls",
                                "Final Position");
                        System.out.println("---------------------------------------------");

                        for (Player p : players) {
                            System.out.printf(
                                    "%-15s %-12d %-14d%n",
                                    p.name,
                                    p.diceCount,
                                    p.position);
                        }
                        return;
                    }

                } while (extraTurn);

                currentPlayerIndex = (currentPlayerIndex + 1) % numberOfPlayers;
            }
        }
    }
}

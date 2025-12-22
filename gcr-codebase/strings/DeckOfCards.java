// Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
// Hint => 
// Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
// Calculate the number of cards in the deck and initialize the deck
// int numOfCards = suits.length * ranks.length;
// Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
// Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
// Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
// Step 2: Inside the Loop Generate a random card number between i and n using the following code 
// int randomCardNumber = i + (int) (Math.random() * (n - i));
// Step 3: Swap the current card with the random card
// Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
// Write a Method to Print the players and their cards


import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck
    static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    // Method to distribute cards to players
    static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {

        if (numCards % numPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }

        int cardsPerPlayer = numCards / numPlayers;
        String[][] players = new String[numPlayers][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    // Method to print players and their cards
    static void printPlayers(String[][] players) {

        if (players == null) {
            return;
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
            String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
            };
            
            String[] deck = initializeDeck(suits, ranks);
            deck = shuffleDeck(deck);
            
            System.out.print("Enter number of cards to distribute: ");
            int numCards = sc.nextInt();
            
            System.out.print("Enter number of players: ");
            int numPlayers = sc.nextInt();
            
            if (numCards > deck.length) {
                System.out.println("Not enough cards in the deck.");
            } else {
                String[][] players = distributeCards(deck, numCards, numPlayers);
                printPlayers(players);
            }
        }
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static List<String> initializeDeck() {
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }

    static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    static List<List<String>> distributeCards(List<String> deck, int numCards, int numPlayers) {
        if (numCards * numPlayers > deck.size()) {
            throw new IllegalArgumentException("Not enough cards to distribute.");
        }
        List<List<String>> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new ArrayList<>());
        }
        for (int i = 0; i < numCards * numPlayers; i++) {
            players.get(i % numPlayers).add(deck.get(i));
        }
        return players;
    }

    static void printPlayersCards(List<List<String>> players) {
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + (i + 1) + "'s cards: " + players.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCards = scanner.nextInt();
        scanner.close();

        List<String> deck = initializeDeck();
        shuffleDeck(deck);
        List<List<String>> players = distributeCards(deck, numCards, numPlayers);
        printPlayersCards(players);
    }
}

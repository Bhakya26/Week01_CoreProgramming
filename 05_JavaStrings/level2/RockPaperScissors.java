import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "User";
        stats[0][1] = String.format("%.2f%%", (userWins * 100.0 / totalGames));
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        System.out.println("\nWin Percentage:");
        System.out.println("Player\tPercentage");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = scanner.nextInt();
        scanner.nextLine(); 
        
        String[][] results = new String[games][3];
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }
        
        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(results, stats);
        
        scanner.close();
    }
}

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        char mostFrequent = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
    
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];
        
        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }
        
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;
        
        for (char ch : str.toCharArray()) {
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequentChar = ch;
            }
        }
        
        return mostFrequentChar;
    }
}

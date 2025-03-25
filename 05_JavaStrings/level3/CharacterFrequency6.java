import java.util.Scanner;

public class CharacterFrequency6 {
    public static int[][] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] == 0) {
                int count = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                        frequency[j] = -1;
                    }
                }
                frequency[i] = count;
            }
        }
        int uniqueCount = 0;
        for (int f : frequency) {
            if (f > 0) {
                uniqueCount++;
            }
        }
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = characters[i];
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int[][] charFrequency = findCharacterFrequency(text);
        
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int[] entry : charFrequency) {
            System.out.println((char) entry[0] + "         | " + entry[1]);
        }
    }
}
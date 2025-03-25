import java.util.Scanner;

public class CharacterFrequency {
    public static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int length = 0;
        
        try {
            while (true) {
                frequency[text.charAt(length)]++;
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
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

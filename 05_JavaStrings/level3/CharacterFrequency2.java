import java.util.Scanner;

public class CharacterFrequency2{
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static int[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int[][] result = new int[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) {
                    count++;
                }
            }
            result[i][0] = c;
            result[i][1] = count;
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
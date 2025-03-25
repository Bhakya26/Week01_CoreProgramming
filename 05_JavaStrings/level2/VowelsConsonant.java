import java.util.Scanner;

public class VowelsConsonant {
    public static int findLengthManual(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String getCharacterType(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacters(String text) {
        int length = findLengthManual(text);
        String[][] result = new String[length][2];
        
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = getCharacterType(c);
        }
        return result;
    }

    public static void displayCharacterAnalysis(String[][] data) {
        System.out.println("Character\tType");
        for (String[] entry : data) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        String[][] analyzedData = analyzeCharacters(inputText);
        displayCharacterAnalysis(analyzedData);
        
        scanner.close();
    }
}

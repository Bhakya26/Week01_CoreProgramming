import java.util.Scanner;

public class StringProcessor {
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

    public static boolean isVowel(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = findLengthManual(text);
        
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (isLetter(c)) {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(inputText);
        
        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);
        
        scanner.close();
    }
}
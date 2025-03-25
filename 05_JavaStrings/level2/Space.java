import java.util.Scanner;

public class Space {
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

    public static int[] findTrimIndices(String text) {
        int length = findLengthManual(text);
        int start = 0, end = length - 1;
        
        while (start < length && text.charAt(start) == ' ') {
            start++;
        }
        while (end > start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substringManual(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = findLengthManual(str1);
        int len2 = findLengthManual(str2);
        
        if (len1 != len2) {
            return false;
        }
        
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        int[] trimIndices = findTrimIndices(inputText);
        String trimmedTextManual = substringManual(inputText, trimIndices[0], trimIndices[1]);
        String trimmedTextBuiltIn = inputText.trim();
        
        System.out.println("Trimmed Text (Manual): " + trimmedTextManual);
        System.out.println("Trimmed Text (Built-in): " + trimmedTextBuiltIn);
        System.out.println("Comparison Result: " + compareStrings(trimmedTextManual, trimmedTextBuiltIn));
        
        scanner.close();
    }
}

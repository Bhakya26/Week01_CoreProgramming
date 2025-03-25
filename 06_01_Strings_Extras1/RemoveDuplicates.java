import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String result = removeDuplicateCharacters(input);
        System.out.println("String after removing duplicates: " + result);
    }
    
    public static String removeDuplicateCharacters(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}

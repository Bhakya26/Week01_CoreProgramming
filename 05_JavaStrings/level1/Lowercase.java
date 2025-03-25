import java.util.Scanner;

public class Lowercase {
    

    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            result.append(ch);
        }
        
        return result.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
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
        
        String builtInLowerCase = inputText.toLowerCase();
        
        String manualLowerCase = toLowerCaseManual(inputText);
        
        boolean isSame = compareStrings(builtInLowerCase, manualLowerCase);
        
        System.out.println("Lowercase using built-in method: " + builtInLowerCase);
        System.out.println("Lowercase using manual method: " + manualLowerCase);
        System.out.println("Are both results the same? " + isSame);
        
        scanner.close();
    }
}

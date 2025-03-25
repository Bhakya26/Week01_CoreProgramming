import java.util.Scanner;

public class Uppercase {
    
   
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase using ASCII value
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
        
       
        String builtInUpperCase = inputText.toUpperCase();
        

        String manualUpperCase = toUpperCaseManual(inputText);
        
        
        boolean isSame = compareStrings(builtInUpperCase, manualUpperCase);
        
        
        System.out.println("Uppercase using built-in method: " + builtInUpperCase);
        System.out.println("Uppercase using manual method: " + manualUpperCase);
        System.out.println("Are both results the same? " + isSame);
        
        scanner.close();
    }
}
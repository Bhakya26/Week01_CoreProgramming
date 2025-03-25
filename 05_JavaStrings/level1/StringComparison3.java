import java.util.Scanner;

public class StringComparison3 {
    
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
    
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        String substringCharAt = createSubstringUsingCharAt(str, start, end);
        String substringBuiltIn = str.substring(start, end);
        
        boolean comparisonResult = compareUsingCharAt(substringCharAt, substringBuiltIn);
        
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in method: " + substringBuiltIn);
        System.out.println("Comparison result: " + comparisonResult);
        
        scanner.close();
    }
}

import java.util.Scanner;

public class StringLengthFinder {
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.next();
        int builtInLength = inputText.length();
        int manualLength = findLengthManual(inputText);
        System.out.println("Length using built-in method: " + builtInLength);
        System.out.println("Length using manual method: " + manualLength);
        System.out.println("Are both results the same? " + (builtInLength == manualLength));
        scanner.close();
    }
}
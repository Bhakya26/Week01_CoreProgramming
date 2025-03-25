import java.util.Scanner;

public class StringSplitter {
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

    public static String[] splitTextManual(String text) {
        int length = findLengthManual(text);
        int spaceCount = 0;
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;
        
        String[] words = new String[spaceCount + 1];
        int start = 0;
        
        for (int i = 0; i <= spaceCount; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        String[] builtInSplit = inputText.split(" ");
        String[] manualSplit = splitTextManual(inputText);
        
        boolean isSame = compareStringArrays(builtInSplit, manualSplit);
        
        System.out.println("Words using built-in split method: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        
        System.out.println("Words using manual split method: ");
        for (String word : manualSplit) {
            System.out.println(word);
        }
        
        System.out.println("Are both results the same? " + isSame);
        scanner.close();
    }
}

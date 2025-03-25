import java.util.Scanner;

public class StringSplitter3 {
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
    
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthManual(words[i]));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        
        String[] manualSplit = splitTextManual(inputText);
        String[][] wordsWithLengths = getWordsWithLengths(manualSplit);
        
        System.out.println("Word\tLength");
        for (String[] wordData : wordsWithLengths) {
            System.out.println(wordData[0] + "\t" + Integer.parseInt(wordData[1]));
        }
        
        scanner.close();
    }
}
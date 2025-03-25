
import java.util.Random;

public class FootballTeamHeights {
    public static final int TEAM_SIZE = 11;
    
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[TEAM_SIZE];
        
        for (int i = 0; i < TEAM_SIZE; i++) {
            heights[i] = random.nextInt(101) + 150; // Range 150 to 250 cm
        }
        
        System.out.println("Football Team Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + calculateMean(heights) + " cm");
    }
}



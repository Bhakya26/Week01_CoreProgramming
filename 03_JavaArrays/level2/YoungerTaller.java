import java.util.Scanner;

public class YoungerTaller{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        
       
        int minAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = friends[i];
            }
        }
        
        
        double maxHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++)
		{
		if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = friends[i];
            }
        }
        
        System.out.println("The youngest friend is " + youngest + " with age " + minAge + ".");
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm.");
        
        sc.close();
    }
	}
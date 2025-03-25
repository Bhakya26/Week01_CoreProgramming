import java.util.Scanner;

public class Percentage2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of students:");
        int number = sc.nextInt();
        
        double[][] marks = new double[number][3]; 
        double[] percentages = new double[number];
        String[] grades = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.println(subject + " marks:");
                marks[i][j] = sc.nextDouble();
                while (marks[i][j] < 0) {
                    System.out.println("Enter a positive value for " + subject + " marks:");
                    marks[i][j] = sc.nextDouble();
                }
            }
            
           
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            
            
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        
        
        System.out.println("\nPhysics \t Chemistry \t Maths \t Percentage \t Grade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %.2f%% \t %s\n", 
                              marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        
        sc.close();
    }
}

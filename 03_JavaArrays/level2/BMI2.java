import java.util.Scanner;

public class BMI2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of persons:");
        int number = sc.nextInt();
        
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
            
            System.out.println("Height (in meters):");
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.println("Enter a positive value for Height:");
                personData[i][0] = sc.nextDouble();
            }
            
            
            System.out.println("Weight (in kg):");
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.println("Enter a positive value for Weight:");
                personData[i][1] = sc.nextDouble();
            }
            
            
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            
            
            if (personData[i][2] >= 30) {
                weightStatus[i] = "Obese";
            } else if (personData[i][2] >= 25) {
                weightStatus[i] = "Overweight";
            } else if (personData[i][2] >= 18.5) {
                weightStatus[i] = "Normal weight";
            } else {
                weightStatus[i] = "Underweight";
            }
        }
        
        
        System.out.println("\nHeight (m) \t Weight (kg) \t BMI \t Weight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %s\n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        
        sc.close();
    }
}

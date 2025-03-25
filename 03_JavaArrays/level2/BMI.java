import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of persons:");
        int numPersons = sc.nextInt();
        
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        
        
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ":");
            weight[i] = sc.nextDouble();
            System.out.println("Enter height (m) for person " + (i + 1) + ":");
            height[i] = sc.nextDouble();
            
           
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        
        System.out.println("\nHeight(m) \t Weight(kg) \t BMI \t Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %s\n", height[i], weight[i], bmi[i], status[i]);
        }
        
        sc.close();
    }
}
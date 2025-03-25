import java.util.Scanner;

public class BMICalculator {
    public static double[][] getUserData(int persons) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[persons][2];
        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        return data;
    }

    public static String[][] calculateBMI(double[][] data) {
        int persons = data.length;
        String[][] results = new String[persons][4];
        for (int i = 0; i < persons; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal weight";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";
            
            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height * 100); // Convert back to cm for display
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        int persons = 10;
        double[][] data = getUserData(persons);
        String[][] results = calculateBMI(data);
        displayResults(results);
    }
}

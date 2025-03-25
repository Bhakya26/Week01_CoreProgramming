import java.util.Scanner;

public class Percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();
        
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentage = new double[numStudents];
        String[] grade = new String[numStudents];
        
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            System.out.println("Physics:");
            physics[i] = sc.nextDouble();
            while (physics[i] < 0) {
                System.out.println("Enter a positive value for Physics:");
                physics[i] = sc.nextDouble();
            }
            
            System.out.println("Chemistry:");
            chemistry[i] = sc.nextDouble();
            while (chemistry[i] < 0) {
                System.out.println("Enter a positive value for Chemistry:");
                chemistry[i] = sc.nextDouble();
            }
            
            System.out.println("Maths:");
            maths[i] = sc.nextDouble();
            while (maths[i] < 0) {
                System.out.println("Enter a positive value for Maths:");
                maths[i] = sc.nextDouble();
            }
            
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        
        System.out.println("\nPhysics \t Chemistry \t Maths \t Percentage \t Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %.2f%% \t %s\n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class EmployeeDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
       
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double years = sc.nextDouble();
            
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; 
                continue;
            }
            
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
        
        
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        
        System.out.println("Employee Details: ");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }
        
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}

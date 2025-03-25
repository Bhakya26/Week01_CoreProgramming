import java.util.*;

public class BonusForEmployees {
    public static double[][] generateEmployeeData(int employees) {
        double[][] employeeData = new double[employees][2];
        Random rand = new Random();
        for (int i = 0; i < employees; i++) {
            employeeData[i][0] = 10000 + rand.nextInt(90000);
            employeeData[i][1] = 1 + rand.nextInt(10);
        }
        return employeeData;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] salaryBonusData = new double[employeeData.length][3];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            salaryBonusData[i][0] = salary;
            salaryBonusData[i][1] = bonus;
            salaryBonusData[i][2] = salary + bonus;
        }
        return salaryBonusData;
    }

    public static void displayResults(double[][] salaryBonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < salaryBonusData.length; i++) {
            totalOldSalary += salaryBonusData[i][0];
            totalBonus += salaryBonusData[i][1];
            totalNewSalary += salaryBonusData[i][2];
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", i + 1, salaryBonusData[i][0], salaryBonusData[i][1], salaryBonusData[i][2]);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int employees = 10;
        double[][] employeeData = generateEmployeeData(employees);
        double[][] salaryBonusData = calculateBonus(employeeData);
        displayResults(salaryBonusData);
    }
}
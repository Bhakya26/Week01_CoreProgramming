import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary (INR): ");
        double salary = sc.nextDouble();

        System.out.print("Enter your bonus (INR): ");
        double bonus = sc.nextDouble();

        double totalIncome = salary + bonus;

        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f%n", salary, bonus, totalIncome);

        sc.close();
    }
}

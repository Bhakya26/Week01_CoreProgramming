import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.next());
        scanner.close();

        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Modified Date: " + modifiedDate);
    }
}

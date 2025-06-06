import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        boolean isPrime = true; 
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) {
                isPrime = false;
                break; 
            }
        }
        
        return isPrime;
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

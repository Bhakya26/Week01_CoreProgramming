import java.util.Scanner;

public class Fibonacci {
    
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Sequence: "+first+" "+second+" ");
        for (int i = 2; i < terms; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            generateFibonacci(terms);
        }
    }
}

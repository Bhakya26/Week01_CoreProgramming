import java.util.Scanner;

public class DoubleOperations {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the value for a: ");
       double a = sc.nextDouble();
       System.out.println("Enter the value for b: ");
       double b = sc.nextDouble();
       System.out.println("Enter the value for c: ");
       double c = sc.nextDouble();
       
       double val1 = a + b *c;
       double val2 = a * b + c;
       double val3 = c + a / b;
       double val4 = a % b + c;
       
       System.out.printf("The results of Int Operations for %.2f, %.2f, %.2f are %.2f, %.2f, %.2f and %.2f%n",a,b,c,val1,val2,val3,val4);
       
       
       sc.close();
   }
}

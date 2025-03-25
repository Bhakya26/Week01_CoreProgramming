import java.util.Scanner;

public class Operations {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the value for a: ");
       int a = sc.nextInt();
       System.out.println("Enter the value for b: ");
       int b = sc.nextInt();
       System.out.println("Enter the value for c: ");
       int c = sc.nextInt();
       
       int val1 = a + b *c;
       int val2 = a * b + c;
       int val3 = c + a / b;
       int val4 = a % b + c;
       
       System.out.printf("The results of Int Operations for %d, %d, %d are %d, %d, %d and %d%n",a,b,c,val1,val2,val3,val4);
       
       
       sc.close();
   }
}

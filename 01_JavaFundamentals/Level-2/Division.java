import java.util.*;

class Division {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend (num1): ");
        int num1 = sc.nextInt();


       System.out.println("Enter the divisor (num2): ");
       int num2 = sc.nextInt();



       
       if(num2==0){
           System.out.println("Zero Division Error");
       }
       
       int r = num1 % num2;
       double q = num1 / num2;
       
       System.out.printf("The Quotient is %.2f and Reminder is %d of two number %d and %d",q,r,num1,num2);

        
    }
}
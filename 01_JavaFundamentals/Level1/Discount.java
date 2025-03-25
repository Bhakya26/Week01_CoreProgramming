import java.util.Scanner;
public class Discount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int fee = sc.nextInt();
        double discountPercent = sc.nextDouble();
        double discounted_Amount = (discountPercent / 100) * fee;
        double discounted_price = fee - discounted_Amount;
        System.out.println("The discount amount is INR " + discounted_Amount + " and final discounted fee is INR " + discounted_price);



    }
}

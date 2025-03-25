import java.util.Scanner;
public class TotalPurchase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unitprice:");
        int unitPrice = sc.nextInt();
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        int totalPurchase = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d", totalPurchase, quantity, unitPrice);
    }
}

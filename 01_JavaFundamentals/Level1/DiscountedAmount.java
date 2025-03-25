public class DiscountedAmount{
    public static void main(String[] args) {
        int fee = 125000;
        double discountPercent = 10;
        double discounted_Amount = (discountPercent / 100) * fee;
        double discounted_price = fee - discounted_Amount;
        System.out.println("The discount amount is INR " + discounted_Amount + " and final discounted fee is INR " + discounted_price);

    }
}
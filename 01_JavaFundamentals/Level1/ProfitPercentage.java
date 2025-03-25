public class ProfitPercentage {
    public static void main(String []args){
        int cp=129;
        int sp=191;
        int Profit = sp - cp;
        double Profit_Percentage = ((double)Profit / cp)* 100;
       System.out.println("The Cost Price is INR 129 and Selling Price is INR 191 ");
       System.out.printf("The Profit is INR %.2f and the Profit Percentage is %.2f",(double)Profit,Profit_Percentage);



    }}
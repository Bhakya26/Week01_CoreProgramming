import java.util.Scanner;
public class Miles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float km;
        km =sc.nextFloat();
        double miles=1.6*km;
        System.out.printf("The total miles is %.2f mile for the given %.2f km",miles,km);


    }
}
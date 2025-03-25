import java.util.Scanner;
public class FindHeight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        int height = sc.nextInt();
        double inch = height / 2.54;
        double foot = height / 30.48;
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and in inches is %.2f\n", (double) height, foot, inch);


    }
}


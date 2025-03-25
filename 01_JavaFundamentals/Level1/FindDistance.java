import java.util.Scanner;
public class FindDistance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int feet=sc.nextInt();
        double yard=feet/3;
        double mile=yard/1760;
        System.out.printf("distance in yards is %.2f and miles is %.2f",yard,mile);
    }
}



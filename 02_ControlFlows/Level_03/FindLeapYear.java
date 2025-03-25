import java.util.Scanner;
public class FindLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		if(year<=1582){
		System.out.println("leapyear wont work");
		}
		else{
		if(year%4==0&&year%100!=0||year%400==0){
		System.out.println("its leap year");
		}
		else{
		System.out.println("its not a leap year");
		}
		}
		sc.close();
		}
		}
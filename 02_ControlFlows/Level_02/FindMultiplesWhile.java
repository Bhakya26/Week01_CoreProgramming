import java.util.Scanner;
public class FindMultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0&&n>100){
		System.out.println("Enter positive number and below 100");
		}
		else{
		int i=100;
		while(i>=1){
		if(i%n==0){
		System.out.println(i);
		}
		i--;
		}
		}
		sc.close();
		}
		}
import java.util.Scanner;
public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
		System.out.println("Enter positive number");
		}
		else{
		for(int i=1;i<=n;i++){
		if(n%i==0){
		System.out.println(i);
		}
		}
		}
		sc.close();
		}
		}
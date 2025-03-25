import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=1;
		for(int i=1;i<=n2;i++){
		result*=n1;
		}
		System.out.println(result);
		
		sc.close();
		}
}
		
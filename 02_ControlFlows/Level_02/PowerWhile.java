import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=1;
		int i=1;
		while(i<=n2){
		result*=n1;
		i++;
		}
		System.out.println(result);
		
		sc.close();
		}
}
		
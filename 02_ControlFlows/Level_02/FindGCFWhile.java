import java.util.Scanner;
public class FindGCFWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int gf=1;
		if(n<=0){
		System.out.println("Enter positive no");
		}
		else{
		int i=n-1;
		while(i>=1){
		if(n%i==0){
		gf=i;
		break;
		}
		i--;
		}
		System.out.println(gf);
		}
		sc.close();
		}
		}
		
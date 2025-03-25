import java.util.Scanner;
public class FindYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter amar age:");
        int amarage=sc.nextInt();
		System.out.println("enter amar height:");
		double amarheight=sc.nextDouble();
		System.out.println("enter akbar age:");
		int akbarage=sc.nextInt();
		System.out.println("enter akbar height:");
		double akbarheight=sc.nextDouble();
		System.out.println("enter antony age:");
		int antonyage=sc.nextInt();
		System.out.println("enter antony height:");
		double antonyheight=sc.nextDouble();
		if(amarage<akbarage&&amarage<antonyage){
		System.out.println("amar is youngest");
		}
		else if(akbarage<amarage&&akbarage<antonyage){
		System.out.println("akbar is youngest");
		}
		else{
		System.out.println("antony is the youngest");
		}
		if(amarheight<akbarheight&&amarheight<antonyheight){
		System.out.println("amar is the largest");
		}else if(akbarheight<amarheight&&akbarheight<antonyheight){
		System.out.println("akbar is the largest");
		}
		else {
		System.out.println("antony is the largest");
		}
	}
}
		
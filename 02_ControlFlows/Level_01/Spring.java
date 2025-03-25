import java.util.Scanner;
public class Spring{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
int day=sc.nextInt();
 boolean isSpring = (month == 3 && day >= 20 && day <= 31) || 
                           (month == 4 && day >= 1 && day <= 30) ||  
                           (month == 5 && day >= 1 && day <= 31) ||  
                           (month == 6 && day >= 1 && day <= 20);
	if(isSpring){
	System.out.println("Its a spring season");
	}
	else{
	System.out.println("Its not a spring season");
	}
	}
}
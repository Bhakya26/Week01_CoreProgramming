import java.util.Scanner;
public class SumOfNumbers2 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double total=0;
while(true){
	double a=sc.nextDouble();
	if(a<=0){
		break;
	}
    total+=a;
}
System.out.println(total);
}
}
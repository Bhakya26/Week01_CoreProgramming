import java.util.Scanner;
public class SumOfN {
public static double sum(int num){
return (num*(num+1)/2);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
double result=sum(num);
System.out.println(result);
}
} 
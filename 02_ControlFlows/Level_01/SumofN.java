import java.util.Scanner;
public class SumofN {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int sum=n1*(n1+1)/2;
if(n1>0){
System.out.printf("The number %d is  a natural number %d",n1,sum);
}
else{
System.out.printf("The number %d is not a natural number",n1);
}
}
}
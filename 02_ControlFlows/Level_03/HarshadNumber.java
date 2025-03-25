import java.util.Scanner;
public class HarshadNumber {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;

while(n>0){
int digit=n%10;
sum+=digit;
n/=10;
}
if(n%sum==0){
System.out.println("harshad number");
}
else{

System.out.println("not a harshad number");
}
sc.close();
}
}
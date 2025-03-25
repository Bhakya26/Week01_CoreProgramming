import java.util.Scanner;
public class Abundant {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
for(int i=1;i<=a;i++){
if(a%i==0){
sum+=i;
}
}
if(a<sum){
System.out.println("abundant number");
}
else{
System.out.println("not an abundant number");
}
sc.close();
}
}
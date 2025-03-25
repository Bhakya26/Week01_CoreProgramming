import java.util.Scanner;
public class SimpleInterest {
public static double si(double principle,double rate,double time){
return principle*rate*time/100;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter principle:");
double principle=sc.nextDouble();
System.out.println("enter rate:");
double rate=sc.nextDouble();
System.out.println("enter time:");
double time=sc.nextDouble();
double interest=si(principle,rate,time);
System.out.println("The Simple Interest is "+interest+  "for Principal "+principle+ "Rate of Interest"+rate+ "and Time" +time);
}
}




 

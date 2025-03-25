import java.util.Scanner;
public class Recursion {
public static int sumofN(int num){
return num*(num+1)/2;
}
public static int recursion(int num){
	if(num==1) return 1;
	return num+recursion(num-1);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a natural number");
int num=sc.nextInt();
if(num<=0){
System.out.println("Enter a positive natural number");
return;
}
int formula=sumofN(num);
int recursive=recursion(num);
System.out.println("sum of n using formula"+formula);
System.out.println("sum of n using recursion"+recursive);
if(formula==recursive){
System.out.println("both are equal");
}else{
	System.out.println("both are not equal,check again!!");
	}
}
}
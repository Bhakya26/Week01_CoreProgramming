import java.util.Scanner;
public class QuoRem{
public static int[] a(int n1,int n2){
int quotient=n1/n2;
int remainder=n1%n2;
return new int[]{quotient,remainder};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int[] result=a(n1,n2);
System.out.println(result[0]);
System.out.println(result[1]);
}
}
 
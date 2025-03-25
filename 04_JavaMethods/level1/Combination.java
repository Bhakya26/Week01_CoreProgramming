import java.util.Scanner;
public class Combination{
public static int a(int n){
return (n*(n-1)/2);
}
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int maxhandshakes=a(n);
System.out.println("maximum handshakes:" +maxhandshakes);
}
}
import java.util.Scanner;
public class Multiply{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int number=sc.nextInt();
int[] arr=new int[4];
for(int i=6;i<=9;i++){
arr[i-6]=number*i;
System.out.println(number+"*"+i+"="+arr[i-6]);
}
}
}





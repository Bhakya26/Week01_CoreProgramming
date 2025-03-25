import java.util.Scanner;
public class Multiplication{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int number=sc.nextInt();
int[] arr=new int[10];
for(int i=1;i<arr.length;i++){
arr[i-1]=number*i;
System.out.println(number+"*"+i+"="+arr[i-1]);
}
}
}





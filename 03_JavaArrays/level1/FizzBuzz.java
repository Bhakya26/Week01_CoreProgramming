import java.util.Scanner;
public class FizzBuzz{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int number=sc.nextInt();
if(number<0){
System.out.println("Error");
}
String[] arr=new String[number+1];

for(int i=0;i<=number;i++){
if(i%3==0&&i%5==0){
arr[i]="fizzbuzz";
}
else if(i%5==0){
arr[i]="buzz";
}
else if(i%3==0){
arr[i]="fizz";
}
else{
	arr[i]=String.valueOf(i);
}
}
for(int i=0;i<=number;i++){
System.out.println("position "+i +" =" +arr[i]);
}
}
}
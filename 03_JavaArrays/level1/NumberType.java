import java.util.Scanner;
public class NumberType{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int i=0;i<arr.length;i++){
	System.out.println("enter a number"+(i+1));
arr[i]=sc.nextInt();
}
for(int n:arr){
if(n==0){
System.out.println(n+"the numbr is zero");
}
else if(n<0){
System.out.println(n+"the number is negative");
}
else if(n>0){

if(n%2==0){
System.out.println(n+"is positive and even");
}
else if(n%2!=0){
System.out.println(n+" is positive and odd");
}
}
}
int first=arr[0];
int last=arr[4];
if(first>last){
	System.out.println(first+"is larger than"+last);
}else if(last>first){
	System.out.println(last+"is larger than"+first);
	
}else{
	System.out.println(first+"is equal to"+last);
}
}
}


import java.util.Scanner;
public class Compare {
public static boolean ispositive(int num){
    return num>=0;
	}
public static boolean iseven(int num){
return num%2==0;
}
public static int compare(int num1,int num2){
if(num1>num2){
return 1;
}
else if(num1<num2){
return -1;
}else{
return 0;
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int i=0;i<arr.length;i++){
System.out.println("Enter number"+(i+1));
arr[i]=sc.nextInt();
}
for(int n:arr)
if(ispositive(n)){
System.out.println(n +"is positive and ");
    if(iseven(n)){
         System.out.println("Even");
    }else{
         System.out.println("odd");
    }
}else{
System.out.println(n+" is negative");
}
int comparison=compare(arr[0],arr[4]);
if (comparison == 1) {
            System.out.println("First number is greater than last number.");
        } else if (comparison == -1) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }
}
}



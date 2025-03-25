import java.util.Scanner;
public class SumOfNumbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double[] arr=new double[10];
double total=0.0;
int index=0;
while(true){
System.out.println("Enter a number (0 or negative to stop):");
int number=sc.nextInt();
if(number<=0){
break;
}
arr[index]=number;
index++;
if(index==10){
	break;
}
}
System.out.println("numbers entered:");
for(int i=0;i<index;i++){
System.out.print(arr[i]+" ");
total+=arr[i];
}

System.out.println("sum total: "+total);
}
}









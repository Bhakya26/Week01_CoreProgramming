import java.util.Scanner;
public class MeanHeight{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double[] height=new double[11];
int sum=0;
for(int i=0;i<11;i++){
	System.out.println("Enter the player"+(i+1)+"height");
height[i]=sc.nextDouble();
sum+=height[i];
}
int total=sum/11;
System.out.println("mean height value of football team"+total);
}
}

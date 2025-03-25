import java.util.Scanner;
public class NoOfChoci{
public static int[] choci(int numOfchoci,int numOfstudents){
int num1=numOfchoci/numOfstudents;
int num2=numOfchoci%numOfstudents;
return new int[]{num1,num2};
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int numOfchoci=sc.nextInt();
int numOfstudents=sc.nextInt();
int[] result=choci(numOfchoci,numOfstudents);
System.out.println("the no of chocolate a student can get:" +result[0]);
System.out.println("remaining chocis:"+ result[1]);
}
}


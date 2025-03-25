import java.util.Scanner;
public class Factors{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int number=sc.nextInt();
if(number<=0){
System.out.println("Error");
}
int maxfactor=10;
int index=0;
int [] factors=new int[maxfactor];
for(int i=1;i<=number;i++){
if(number%i==0){
if(maxfactor==index){
maxfactor*=2;
int[] temp=new int[maxfactor];
System.arraycopy(factors, 0, temp, 0, factors.length);
factors = temp;
}
factors[index++]=i;
}
}
for(int i=0;i<index;i++){
System.out.println("FActors of the number:"+factors[i]);
}
}
}

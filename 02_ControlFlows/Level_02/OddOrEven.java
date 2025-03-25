import java.util.Scanner;
public class OddOrEven {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<=0){
System.out.println("Enter valid positive number");
}
else{
for(int i=1;i<a;i++){
if(i%2==0){
System.out.printf("%d is even",i);
}
else{
System.out.printf("%d is odd",i);
}
}
}
}
}

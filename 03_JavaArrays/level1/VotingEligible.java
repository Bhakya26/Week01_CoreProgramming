import java.util.Scanner;
public class VotingEligible{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int []age=new int[10];
for(int i=0;i<age.length;i++){
System.out.println("enter student age"+(i+1));
age[i]=sc.nextInt();
}
for(int n:age){
if(n<0){
System.out.println("invalid age");
}
else if(n>=18){
System.out.println("eligible for voting");
}
else{
System.out.println("not eligible");
}
}
}
}

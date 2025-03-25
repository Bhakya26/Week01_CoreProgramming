import java.util.Scanner;
public class PositiveNegative{
public static int a(int num){
if(num==0){
return 0;
}
else if(num>0){
return 1;
}
else{
return -1;
}
}
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int result=a(num);
System.out.println(result);
}
}
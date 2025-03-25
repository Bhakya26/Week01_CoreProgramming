import java.util.Scanner;
public class FindTables {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=6;i<=9;i++){
int n=i*a;
System.out.println(i+"*"+a+ "="+ n);
}
}
}

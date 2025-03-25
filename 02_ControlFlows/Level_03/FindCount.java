import java.util.Scanner;
public class FindCount {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
if(n>0){
for(int i=1;i<=n;i++){
n/=10;
count++;
}
System.out.println(count);
}
sc.close();
}
}
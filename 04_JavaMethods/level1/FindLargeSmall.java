import java.util.Scanner;
public class FindLargeSmall{
public static  String largesmall(int a,int b, int c){
	int largest,smallest;
	
if(a>b&&a>c){
largest=a;
}else if(b>a&&b>c){
	largest=b;

}else{
largest=c;
}

if(a<b&&a<c){
smallest=a;
}else if(b<a&&b<c){
smallest=b;
}else{
smallest=c;
}
return "Largest: " + largest + ", Smallest: " + smallest;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
String n=largesmall(a,b,c);
System.out.println(n);
}
}

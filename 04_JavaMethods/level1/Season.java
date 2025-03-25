import java.util.Scanner;
public class Season{
public static boolean SpringSeason(int month,int date){
return (month>=3&&date>=20)||(month==4)||(month==5)||(month==6&&date<=20);
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
int date=sc.nextInt();
if(SpringSeason (month,date)){
System.out.println("its a spring season");
}else{
System.out.println("its not a spring season");
}
}
}
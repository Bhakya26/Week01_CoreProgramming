import java.util.Scanner;
public class LeapYear {
public static String leapYEar(int year){
	if(year<1582){
		return "not applicable";
	}
else if(year%4==0&&year%100!=0||year%400==0){
return "Its a leap year";
}else{
return "ITs not a leap year";
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
String result=leapYEar(year);
System.out.println(result);
}
}

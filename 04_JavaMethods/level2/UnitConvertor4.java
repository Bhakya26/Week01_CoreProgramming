import java.util.Scanner;
public class UnitConvertor4{

public static double pounds2kilograms = 0.453592;
public static double kilograms2pounds = 2.20462; 
public static double gallons2liters = 3.78541; 
public static double liters2gallons = 0.264172; 
public static double convertftoc(double farhenheit){
return (farhenheit - 32) * 5 / 9;
}
public static double convertctof(double celsius){
return (celsius * 9 / 5) + 32;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter fahrenheit");
double fahrenheit=sc.nextDouble();
System.out.println("Enter celsius");
double celsius=sc.nextDouble();
System.out.println(fahrenheit+"Fahrenheit converted to"+convertftoc(fahrenheit)+"celsius");
System.out.println(celsius+"Celsius converted to"+convertctof(celsius)+" fahrenheit");
}
}


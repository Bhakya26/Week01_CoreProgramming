import java.util.Scanner;
public class BMIII {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Weight in kgs");
double weight=sc.nextDouble();
System.out.println("height in cm");

double height=sc.nextDouble();
double hinm=height/100;
double bmi=weight / (hinm * hinm);
if(bmi<=18.4){
System.out.println("Unerweight");
}
else if(bmi>=18.5&&bmi<=24.9){
System.out.println("Normal");
}
else if(bmi>=25.0&&bmi<=39.9){
System.out.println("Overweight");
}
else if(bmi>=40.0){
System.out.println("obese");
}
sc.close();
}
}




         


   
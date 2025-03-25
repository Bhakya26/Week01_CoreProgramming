import java.util.Scanner;
public class BonusAmount {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double salary=sc.nextInt();
int yearofservice=sc.nextInt();
if(yearofservice>5){
double bonusamount=(5/100)*salary;
System.out.println("bonusamount"+bonusamount);
}else{
System.out.println("not eligible");
}
}
}

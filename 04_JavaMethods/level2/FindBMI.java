import java.util.Scanner;
public class FindBMI {
public static double bmi(double weight,double heightcm){
double heightm=heightcm/100;
return weight/(heightm*heightm);
}
public static String status(double bmi){
if(bmi<=18.4){
return  "underweight";
}else if(bmi>=18.5&&bmi<=24.9){
return "normal";}
else if(bmi>=25.0&&bmi<=39.9){
return"overweight";
}else{
return"obese";
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double[][] arr=new double[10][3];
String[] result=new String[10];
for(int i=0;i<arr.length;i++){
System.out.println("Enter weight of student "+(i+1)+":");
arr[i][0]=sc.nextInt();
System.out.println("Enter height of student "+(i+1)+":");
arr[i][1]=sc.nextDouble();
arr[i][2]=bmi(arr[i][0],arr[i][1]);
result[i]=status(arr[i][2]);
}
System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", arr[i][0], arr[i][1],arr[i][2],result[i]);
        }
	}
	}





import java.util.Scanner;
public class Arithmetic{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        float div=(float)num1/num2;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, and %.2f",num1,num2,add,sub,mul,div);
    }
    }

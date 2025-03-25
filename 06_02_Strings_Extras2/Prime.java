import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
 }
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num=sc.nextInt();
    
    if(isPrime(num)){
        System.out.println(num+" is prime number");
    }else{
        System.out.println(num+" is not a prime number");
    }
 }
    }

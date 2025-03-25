import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String reverse=" ";
        for(int i=a.length()-1;i>=0;i--){
            reverse+=a.charAt(i);
         }
         System.out.println("Reversed: "+reverse);
    }
}
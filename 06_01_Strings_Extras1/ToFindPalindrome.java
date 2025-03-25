import java.util.Scanner;
public class ToFindPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String reversed="";
        for(int i=a.length()-1;i>=0;i--){
            reversed+=a.charAt(i);
        }
        if(a.equals(reversed)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}
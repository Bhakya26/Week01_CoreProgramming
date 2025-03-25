import java.util.Scanner;
public class Largest {
    public static String largest(int n1,int n2,int n3){
        if(n1>n2&&n1>n3){
            return n1+"is the largest";
        }else if(n2>n1&&n2>n3){
            return n2+"is the largest";
        }else{
            return n3+"is the largest";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        String result=largest(n1,n2,n3);
        System.out.println(result);
    }
}

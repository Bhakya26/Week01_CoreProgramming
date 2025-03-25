import java.util.Scanner;
public class SidePerimeter {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int perimeter=sc.nextInt();
        double side=(double)perimeter/4;
        System.out.printf("The length of the side is %.2f whose perimeter is %d",side,perimeter);

    }
}

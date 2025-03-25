import java.util.Scanner;
   public class Triangle {
         public static double rounds(double perimeter,double distance){
            return distance/perimeter;
         }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        double perimeter=s1+s2+s3;
        double distance=5;
        double a=rounds(perimeter,distance);
        System.out.println("rounds an athlete can complete "+a);
		}
	}
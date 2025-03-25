import java.util.Scanner;
public class AreaOfTraingle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle : ");
        double height = sc.nextDouble();
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;
        System.out.printf("The area of the triangle is: %.2f square inches %.2f square cm",
                        areaInSqInches, areaInSqCm);
    }
        }



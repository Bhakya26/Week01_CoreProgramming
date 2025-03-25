import java.util.Scanner;

class ParkRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        int totalRounds = (int) Math.ceil(5000 / perimeter);

        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km.");

        sc.close();
    }
}

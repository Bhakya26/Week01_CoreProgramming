import java.util.Scanner;

class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the departure city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = sc.nextDouble();

        System.out.print("Enter the travel time from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = sc.nextDouble();

        System.out.print("Enter the travel time from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println(name + " is traveling from " + fromCity + " to " + toCity + " via " + viaCity + ".");
        System.out.println("The total distance covered is " + totalDistance + " miles.");
        System.out.println("The total time taken is " + totalTime + " minutes.");

        sc.close();
    }
}

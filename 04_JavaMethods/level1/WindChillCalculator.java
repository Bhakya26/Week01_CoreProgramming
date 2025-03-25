public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter wind speed in mph: ");
        double windSpeed = scanner.nextDouble();
        
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill formula is only valid for temperatures at or below 50°F and wind speeds above 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }
        
        scanner.close();
    }
}

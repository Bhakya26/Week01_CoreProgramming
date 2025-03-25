import java.util.Scanner;

class UnitConverter45 {
    public static double KM_TO_MILES = 0.621371;
    public static double MILES_TO_KM = 1.60934;
    public static double METERS_TO_FEET = 3.28084;
    public static double FEET_TO_METERS = 0.3048;
	public static double yardstofeet=3;
	public static double feetstoyards=0.333333;
	public static double meterstoinches = 39.3701;
    public static double inchestometers = 0.0254;
	public static double inchestocm = 2.54;
	public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }
	public static double convertyardstofeet(double yards) {
        return yards * yardstofeet;
    }
	public static double convertmeterstoinches(double meters) {
        return meters * meterstoinches;
    }
	public static double convertyardsinchestometers(double inches) {
        return inches * inchestometers;
    }
	public static double convertinchestocm(double inches) {
        return inches * inchestocm;
    }
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double km=sc.nextDouble();
	double miles=sc.nextDouble();
	double meters=sc.nextDouble();
	double feet=sc.nextDouble();
	double yards=sc.nextDouble();
	double inches=sc.nextDouble();
	
	System.out.println(km+ "converted to miles"+ convertKmToMiles(km));
	System.out.println(miles+ "converted to km"+ convertMilesToKm(miles));
	System.out.println(meters+ "converted to feet"+ convertMetersToFeet(meters));
	System.out.println(feet+ "converted to meters"+ convertFeetToMeters(feet));
	System.out.println(yards+ "converted to feet"+ convertyardstofeet( yards));
	System.out.println(meters+ "converted to inches"+ convertmeterstoinches(meters));
	System.out.println(inches+ "converted to meters"+ convertyardsinchestometers( inches));
	System.out.println(inches+ "converted to cm"+ convertinchestocm(inches));
	
}
	}


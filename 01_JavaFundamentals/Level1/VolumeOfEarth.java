public class VolumeOfEarth{
    public static void main(String[] args) {
        double r= 6378.137;
        double miles = 0.621371192;
        double a = (4.0 / 3.0) * Math.PI;
        double volumeKm3 = a * Math.pow(r, 3);
        double radiusMiles = r * miles;
        double volumeMiles3 = a * Math.pow(radiusMiles, 3);
        System.out.printf("The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f\n", volumeKm3, volumeMiles3);
    }
}

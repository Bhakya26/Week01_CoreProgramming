import java.util.Scanner;
public class PossibleHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = (double) n * (n - 1) / 2;
        System.out.println("possible handshakes" + a);
    }
}



import java.util.*;

public class NumberChecker6{
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        return factors[factors.length - 2];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = getFactors(num);
        return sumOfFactors(factors) - num == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = getFactors(num);
        return sumOfFactors(factors) - num > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = getFactors(num);
        return sumOfFactors(factors) - num < num;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));
        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        int[] factors = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(num));
        System.out.println("Is Abundant Number: " + isAbundantNumber(num));
        System.out.println("Is Deficient Number: " + isDeficientNumber(num));
        System.out.println("Is Strong Number: " + isStrongNumber(num));
    }
}
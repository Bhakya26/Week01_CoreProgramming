import java.util.*;

public class NumberChecker5{
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

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0");
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpyNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));
        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversedDigits));
        System.out.println("Are original and reversed arrays equal: " + areArraysEqual(digits, reversedDigits));
        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Neon Number: " + isNeonNumber(num));
        System.out.println("Is Spy Number: " + isSpyNumber(num));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(num));
        System.out.println("Is Buzz Number: " + isBuzzNumber(num));
    }
}
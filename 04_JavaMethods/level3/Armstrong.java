import java.util.*;

public class Armstrong {
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

    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0");
    }

    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigitsArray(num);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Number: " + num);
        System.out.println("Count of Digits: " + countDigits(num));
        int[] digits = getDigitsArray(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(num));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(num));
        int[] largestNumbers = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestNumbers[0] + ", Second Largest: " + largestNumbers[1]);
        int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestNumbers[0] + ", Second Smallest: " + smallestNumbers[1]);
    }
}

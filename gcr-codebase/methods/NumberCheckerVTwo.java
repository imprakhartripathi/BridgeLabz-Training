/*
Q2, Q3, Q4, Q5, Q6 COMBINED

Extend or Create a NumberChecker utility class and perform the following tasks.
All methods are static and are called from main() method.

Covered checks:
- Digit count and digit storage
- Duck number
- Armstrong number
- Largest & second largest digit
- Smallest & second smallest digit
- Sum of digits
- Sum of squares of digits
- Harshad number
- Digit frequency
- Reverse digits
- Palindrome number
- Prime number
- Neon number
- Spy number
- Automorphic number
- Buzz number
- Perfect number
- Abundant number
- Deficient number
- Strong number
*/

import java.util.Scanner;

public class NumberCheckerVTwo {

    // ---------- BASIC DIGIT OPERATIONS ----------

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] storeDigits(int number) {
        String s = String.valueOf(Math.abs(number));
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // ---------- Q2 METHODS ----------

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // ---------- Q3 METHODS ----------

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // ---------- Q4 METHODS ----------

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseDigits(digits));
    }

    // ---------- Q5 METHODS ----------

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        return sumOfDigits(storeDigits(square)) == number;
    }

    public static boolean isSpy(int[] digits) {
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // ---------- Q6 METHODS ----------

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        for (int d : storeDigits(number)) {
            sum += factorial(d);
        }
        return sum == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // ------------------- MAIN METHOD -----------------------

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            int[] digits = storeDigits(number);
            
            System.out.println("Digit Count: " + countDigits(number));
            System.out.println("Duck Number: " + isDuckNumber(digits));
            System.out.println("Armstrong Number: " + isArmstrong(number, digits));
            System.out.println("Palindrome: " + isPalindrome(digits));
            System.out.println("Prime Number: " + isPrime(number));
            System.out.println("Neon Number: " + isNeon(number));
            System.out.println("Spy Number: " + isSpy(digits));
            System.out.println("Automorphic Number: " + isAutomorphic(number));
            System.out.println("Buzz Number: " + isBuzz(number));
            System.out.println("Harshad Number: " + isHarshad(number, digits));
            System.out.println("Perfect Number: " + isPerfect(number));
            System.out.println("Abundant Number: " + isAbundant(number));
            System.out.println("Deficient Number: " + isDeficient(number));
            System.out.println("Strong Number: " + isStrong(number));
        }
    }
}

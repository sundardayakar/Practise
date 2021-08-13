package methodslearning;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        doTaks();
    }

    public static void doTaks() {
        int number = readInput();
        int numberOfFactors = countFactors(number);
        boolean res = decideIfPrime(numberOfFactors);
        if (res) {
            printResult("The Given number " + number + " is prime number");
        } else {
            printResult("It is not prime");
        }
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number");
        int number = scanner.nextInt();
        return number;
    }

    public static int countFactors(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            boolean ans = isDivisible(number, i);
            if (ans) {
                result++;
            }
        }
        return result;
    }

    public static boolean isDivisible(int dividend, int divisor) {
        if (dividend % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean decideIfPrime(int factorCount) {
        if (factorCount == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void printResult(String res) {
        System.out.println(res);
    }
}

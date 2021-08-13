package methodslearning;

import java.util.Scanner;

public class EvenOddPrime {
    public static void main(String[] args) {
        int[] takingInputs = ReadingInputs();
        int evenCounting = countingEvenNumbers(takingInputs);
        printingResult("number of Even Numbers " + evenCounting);
        int oddCounting = countingOddNumbers(takingInputs);
        printingResult("number of odd Numbers " + oddCounting);
        int primeCounting = countingPrimeNumbers(takingInputs);
        printingResult("number of prime numbers" + primeCounting);
    }

    public static int[] ReadingInputs() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        int arraySize = Scanner.nextInt();
        int[] input = new int[arraySize];
        System.out.println("enter the numbers");
        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }
        return input;
    }

    public static int countingEvenNumbers(int[] numbers) {
        int evenCount = 0;
        for (int i = 1; i <= numbers.length; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int countingOddNumbers(int[] numbers) {
        int oddCount = 0;
        for (int i = 1; i <= numbers.length; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public static int countingPrimeNumbers(int[] numbers) {
        int primeCount = 0;
        for (int i = 1; i < numbers.length; i = i + 1) {
            boolean isPrime = checkForPrime(numbers[i]);
            if (isPrime) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static boolean checkForPrime(int number) {
        int factorsCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsCount++;
            }
        }
        if (factorsCount == 2) {
            return true;
        } else {
            return false;
        }
    }


    public static void printingResult(String result) {
        System.out.println(result);
    }
}






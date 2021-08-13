package methodslearning;

import java.util.Scanner;

public class RepeatedNumbers {
    public static void main(String[] args) {
        int[] takingInputs = readingInputs();
        int[] checkingRepeat = checkingRepeated(takingInputs);
        System.out.println("the repeated numbers are");
        printing(checkingRepeat);
    }


    public static int[] readingInputs() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("how many numbers");
        int arraySize = Scanner.nextInt();
        System.out.println("enter the numbers");
        int[] input = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            input[i] = Scanner.nextInt();
        }
        return input;
    }

    public static int[] checkingRepeated(int[] numbers) {
        int arraySize = numbers.length / 2;
        int[] result = new int[arraySize];
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    result[position] = numbers[j];
                    position++;
                }
            }
        }
        return result;
    }

    public static void printing(int[] result) {
        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }

    }

}



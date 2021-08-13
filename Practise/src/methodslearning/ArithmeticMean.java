package methodslearning;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] input = readingInputs();
        float addingInputs = addingInputs(input);
        float sumOfInputs = sumOfInputs(input);
        printing("the arithmetic is " + addingInputs / sumOfInputs);


    }

    public static int[] readingInputs() {
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

    public static float addingInputs(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp + numbers[i];
        }
        return temp;
    }

    public static float sumOfInputs(int[] numbers) {
        int temp = 0;
        temp = numbers.length;
        return temp;
    }

    public static void printing(String result) {
        System.out.println(result);
    }
}

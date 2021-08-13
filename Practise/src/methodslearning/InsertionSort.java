package methodslearning;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = readingInputs();
        sorting(input);
        printingArray(input);
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

    public static void sorting(int[] numbers) {
        int temp;
        int j;
        for (int i = 1; i < numbers.length; i++) {
            temp = numbers[i];
            j = i;
            while (j > 0 && numbers[j - 1] > temp) {
                numbers[j] = numbers[j - 1];
                j = j - 1;
            }
            numbers[j] = temp;
        }
    }

    public static void printingArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

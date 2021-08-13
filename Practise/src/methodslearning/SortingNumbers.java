package methodslearning;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        int[] input = readingInputs();
        sort(input);
        printArray(input);
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

    public static void sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] numbers, int place1, int place2) {
        int temp = 0;
        temp = numbers[place1];
        numbers[place1] = numbers[place2];
        numbers[place2] = temp;
    }

    public static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
